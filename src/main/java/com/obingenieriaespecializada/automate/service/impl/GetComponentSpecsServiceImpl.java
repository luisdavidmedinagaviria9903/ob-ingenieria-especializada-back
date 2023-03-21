package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventorySpecsDto;
import com.obingenieriaespecializada.automate.mapper.ComponentSpecsMapper;
import com.obingenieriaespecializada.automate.repository.ComponentEntryInventorySpecsRepository;
import com.obingenieriaespecializada.automate.repository.ComponentEntryTypeSpecsRepository;
import com.obingenieriaespecializada.automate.repository.ComponentEvaluationInventorySpecsRepository;
import com.obingenieriaespecializada.automate.repository.ComponentTypeRepository;
import com.obingenieriaespecializada.automate.service.GetComponentSpecsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetComponentSpecsServiceImpl implements GetComponentSpecsService {

    private final ComponentTypeRepository componentTypeRepository;
    private final ComponentEntryTypeSpecsRepository componentEntryTypeSpecsRepository;

    private final ComponentEvaluationInventorySpecsRepository componentEvaluationInventorySpecsRepository;
    private final ComponentSpecsMapper componentSpecsMapper;

    public GetComponentSpecsServiceImpl(ComponentTypeRepository componentTypeRepository,
                                        ComponentEntryTypeSpecsRepository componentEntryTypeSpecsRepository,
                                        ComponentEvaluationInventorySpecsRepository componentEvaluationInventorySpecsRepository,
                                        ComponentSpecsMapper componentSpecsMapper) {
        this.componentTypeRepository = componentTypeRepository;
        this.componentEntryTypeSpecsRepository = componentEntryTypeSpecsRepository;
        this.componentEvaluationInventorySpecsRepository = componentEvaluationInventorySpecsRepository;
        this.componentSpecsMapper = componentSpecsMapper;
    }

    @Override
    public List<ComponentTypeDto> getAllComponentsType() {
        return this.componentTypeRepository.findAllByStatus(Boolean.TRUE)
                .stream().map(this.componentSpecsMapper::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<ComponentEntryTypeSpecsDto> findAllByComponentType_Code(String code) {
        return this.componentEntryTypeSpecsRepository.findAllByComponentType_Code(code)
                .stream().map(this.componentSpecsMapper::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public ComponentTypeDto findByCode(String code) {
        return this.componentSpecsMapper.convertTo(this.componentTypeRepository.findByCode(code));
    }

    @Override
    public List<RWComponentEvaluationInventorySpecsDto> findAllComponentEvaluationSpecs() {
        return this.componentEvaluationInventorySpecsRepository.findAllByStatus(1)
                .stream()
                .map(this.componentSpecsMapper::convertTo)
                .collect(Collectors.toList());
    }
}
