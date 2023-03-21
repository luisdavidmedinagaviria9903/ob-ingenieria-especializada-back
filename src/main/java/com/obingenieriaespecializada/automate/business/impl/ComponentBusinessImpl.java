package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.ComponentBusiness;
import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;
import com.obingenieriaespecializada.automate.service.ComponentService;
import com.obingenieriaespecializada.automate.service.GetComponentSpecsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class ComponentBusinessImpl implements ComponentBusiness {

    private final ComponentEntryBusiness componentEntryBusiness;
    private final ComponentService componentService;

    private final GetComponentSpecsService getComponentSpecsService;

    public ComponentBusinessImpl(ComponentEntryBusiness componentEntryBusiness, ComponentService componentService,
                                 GetComponentSpecsService getComponentSpecsService) {
        this.componentEntryBusiness = componentEntryBusiness;
        this.componentService = componentService;
        this.getComponentSpecsService = getComponentSpecsService;
    }

    @Override
    public Map<String, Object> findAll(FindAllEntryParams findAllEntryParams) {
        return this.componentService.findAll(findAllEntryParams);
    }

    @Override
    public Optional<RWComponentEntryDto> save(RWComponentEntryDto componentEntryDto) {
        try {
            componentEntryDto.getComponent().setCreationDate(LocalDateTime.now());
            componentEntryDto.getComponent().setStatus(ComponentStatusEnum.ENTRY);
            Optional<RWComponentDto> isComponentSaved = this.componentService.save(componentEntryDto.getComponent());

            if (isComponentSaved.isPresent() && !ObjectUtils.isEmpty(isComponentSaved.get().getId())) {

                componentEntryDto.setComponent(isComponentSaved.get());
                componentEntryDto.setCreationDate(LocalDateTime.now());

                Optional<RWComponentEntryDto> componentEntrySaved = this.componentEntryBusiness.save(componentEntryDto);

                String buildEq = this.buildEq(componentEntryDto.getComponent().getType(), isComponentSaved.get().getId());
                this.componentService.updateComponentEq(isComponentSaved.get().getId(), buildEq);

                return componentEntrySaved;
            }
        } catch (Exception e) {
            log.error("ERROR when saving component entry" + e.getMessage() + e.getCause());
        }


        return Optional.empty();
    }

    private String buildEq(String componentType, Long componentId) {
        ComponentTypeDto componentTypeDto = this.getComponentSpecsService.findByCode(componentType);
        return componentTypeDto.getAbbreviation() + componentId;
    }
}
