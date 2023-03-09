package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import com.obingenieriaespecializada.automate.mapper.ComponentSpecsMapper;
import com.obingenieriaespecializada.automate.repository.ComponentEntryInventorySpecsRepository;
import com.obingenieriaespecializada.automate.repository.ComponentEntryTypeSpecsRepository;
import com.obingenieriaespecializada.automate.repository.ComponentTypeRepository;
import com.obingenieriaespecializada.automate.service.GetComponentSpecsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetComponentSpecsServiceImpl implements GetComponentSpecsService {

    private final ComponentTypeRepository componentTypeRepository;
    private final ComponentEntryInventorySpecsRepository componentEntryInventorySpecsRepository;
    private final ComponentEntryTypeSpecsRepository componentEntryTypeSpecsRepository;
    private final ComponentSpecsMapper componentSpecsMapper;

    public GetComponentSpecsServiceImpl(ComponentTypeRepository componentTypeRepository,
                                        ComponentEntryInventorySpecsRepository componentEntryInventorySpecsRepository,
                                        ComponentEntryTypeSpecsRepository componentEntryTypeSpecsRepository,
                                        ComponentSpecsMapper componentSpecsMapper) {
        this.componentTypeRepository = componentTypeRepository;
        this.componentEntryInventorySpecsRepository = componentEntryInventorySpecsRepository;
        this.componentEntryTypeSpecsRepository = componentEntryTypeSpecsRepository;
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
}
