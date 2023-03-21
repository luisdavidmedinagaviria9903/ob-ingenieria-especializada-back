package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.read.RComponentEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntity;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;
import com.obingenieriaespecializada.automate.mapper.ComponentMapper;
import com.obingenieriaespecializada.automate.repository.RComponentRepository;
import com.obingenieriaespecializada.automate.repository.WComponentRepository;
import com.obingenieriaespecializada.automate.service.ComponentService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ComponentServiceImpl implements ComponentService {

    private final RComponentRepository rComponentRepository;
    private final WComponentRepository wComponentRepository;
    private final ComponentMapper componentEntryMapper = Mappers.getMapper(ComponentMapper.class);

    public ComponentServiceImpl(RComponentRepository rComponentRepository, WComponentRepository wComponentRepository) {
        this.rComponentRepository = rComponentRepository;
        this.wComponentRepository = wComponentRepository;
    }


    @Override
    public Optional<RWComponentDto> save(RWComponentDto RComponentDto) {
        RWComponentEntity save =  this.wComponentRepository.save(componentEntryMapper.convertTo(RComponentDto));
       return !ObjectUtils.isEmpty(save) ? Optional.of(componentEntryMapper.convertTo(save)) : Optional.empty();
    }


    @Override
    public void updateComponentEq(Long componentId, String eq) {
        Optional<RWComponentEntity> findComponent = this.wComponentRepository.findById(componentId);
        if (findComponent.isPresent()){
            findComponent.get().setEq(eq);
            this.wComponentRepository.saveAndFlush(findComponent.get());
        }
    }

    @Override
    public Map<String, Object> findAll(FindAllEntryParams findAllEntryParams) {

        Optional<Sort> sorting;
        Pageable pageable;
        Page<RComponentEntity> query;

        Map<String, Object> result = new HashMap<>();

        if (findAllEntryParams.getOrder().equals("asc")) {
            sorting = Optional.of(Sort.by(findAllEntryParams.getSort()).ascending());
        } else {
            sorting = Optional.of(Sort.by(findAllEntryParams.getSort()).descending());
        }

        pageable = PageRequest.of(findAllEntryParams.getPage(), findAllEntryParams.getSize())
                .withSort(sorting.orElseGet(() -> Sort.by(findAllEntryParams.getSort())));


        if (!ObjectUtils.isEmpty(findAllEntryParams.getClientId())) {
            query = this.rComponentRepository.findAllByClient_Id(findAllEntryParams.getClientId(), pageable);
        } else if (!ObjectUtils.isEmpty(findAllEntryParams.getComponentStatus())) {
            query = this.rComponentRepository.findAllByStatus(ComponentStatusEnum.getByIndex(findAllEntryParams.getComponentStatus()), pageable);
        } else {
            query = this.rComponentRepository.findAll(pageable);
        }


        if (!ObjectUtils.isEmpty(query)) {
            result.put("items", query.getContent());
            result.put("currentPage", query.getNumber());
            result.put("totalItems", query.getTotalElements());
            result.put("totalPages", query.getTotalPages());
        }

        return result;
    }
}
