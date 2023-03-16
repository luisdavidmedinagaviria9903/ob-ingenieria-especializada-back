package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;
import com.obingenieriaespecializada.automate.mapper.ComponentMapper;
import com.obingenieriaespecializada.automate.repository.ComponentRepository;
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

    private final ComponentRepository componentRepository;
    private final ComponentMapper componentEntryMapper = Mappers.getMapper(ComponentMapper.class);

    public ComponentServiceImpl(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    @Override
    public Optional<ComponentDto> save(ComponentDto componentDto) {
        ComponentEntity save =  this.componentRepository.save(componentEntryMapper.convertTo(componentDto));
       return !ObjectUtils.isEmpty(save) ? Optional.of(componentEntryMapper.convertTo(save)) : Optional.empty();
    }

    @Override
    public Optional<ComponentDto> findFirstByEqEquals(String eq) {
        ComponentEntity component = this.componentRepository.findFirstByEqEquals(eq);
        return !ObjectUtils.isEmpty(component) ? Optional.ofNullable(componentEntryMapper.convertTo(component)) : Optional.empty();
    }

    @Override
    public void updateComponentEq(Long componentId, String eq) {
        Optional<ComponentEntity> findComponent = this.componentRepository.findById(componentId);
        if (findComponent.isPresent()){
            findComponent.get().setEq(eq);
            this.componentRepository.saveAndFlush(findComponent.get());
        }
    }

    @Override
    public Map<String, Object> findAll(FindAllEntryParams findAllEntryParams) {

        Optional<Sort> sorting;
        Pageable pageable;
        Page<ComponentEntity> query;

        Map<String, Object> result = new HashMap<>();

        if (findAllEntryParams.getOrder().equals("asc")) {
            sorting = Optional.of(Sort.by(findAllEntryParams.getSort()).ascending());
        } else {
            sorting = Optional.of(Sort.by(findAllEntryParams.getSort()).descending());
        }

        pageable = PageRequest.of(findAllEntryParams.getPage(), findAllEntryParams.getSize())
                .withSort(sorting.orElseGet(() -> Sort.by(findAllEntryParams.getSort())));


        if (!ObjectUtils.isEmpty(findAllEntryParams.getClientId())) {
            query = this.componentRepository.findAllByComponentEntry_Client_Id(findAllEntryParams.getClientId(), pageable);
        } else if (!ObjectUtils.isEmpty(findAllEntryParams.getComponentStatus())) {
            query = this.componentRepository.findAllByStatus(ComponentStatusEnum.getByIndex(findAllEntryParams.getComponentStatus()), pageable);
        } else {
            query = this.componentRepository.findAll(pageable);
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
