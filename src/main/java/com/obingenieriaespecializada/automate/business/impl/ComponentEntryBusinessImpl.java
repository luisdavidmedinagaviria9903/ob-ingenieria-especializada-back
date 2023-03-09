package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.service.ComponentEntryService;
import com.obingenieriaespecializada.automate.service.ComponentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class ComponentEntryBusinessImpl implements ComponentEntryBusiness {

    private final ComponentEntryService componentEntryService;
    private final ComponentService componentService;

    public ComponentEntryBusinessImpl(ComponentEntryService componentEntryService,
                                      ComponentService componentService) {
        this.componentEntryService = componentEntryService;
        this.componentService = componentService;
    }

    @Override
    public Map<String, Object> findAll() {
        return this.componentEntryService.findAll();
    }

    @Override
    public Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry) {

        try {
            Optional<ComponentDto> isComponentSaved = this.componentService.save(componentEntry.getComponent());
            if (isComponentSaved.isPresent() && !ObjectUtils.isEmpty(isComponentSaved.get().getId())){

                componentEntry.setComponent(isComponentSaved.get());
                Optional<ComponentEntryDto> isEntrySaved = this.componentEntryService.save(componentEntry);

                if (isEntrySaved.isPresent() && !ObjectUtils.isEmpty(isEntrySaved.get().getId())){

                    componentEntry.getInventory()
                            .forEach(inventory -> inventory.setIdComponentEntry(isEntrySaved.get().getId()));
                    componentEntry.getPictures()
                            .forEach(picture -> picture.setIdComponentEntry(isEntrySaved.get().getId()));

                    this.componentEntryService.saveAllInventory(componentEntry.getInventory())
                            .ifPresent(inventorySaved -> isEntrySaved.get().setInventory(inventorySaved));
                    this.componentEntryService.saveAllPictures(componentEntry.getPictures())
                            .ifPresent(picturesSaved -> isEntrySaved.get().setPictures(picturesSaved));

                    return isEntrySaved;
                }
            }
        }catch (Exception e){
                log.error("ERROR when saving component entry" + e.getMessage() + e.getCause());
        }

        return Optional.empty();


    }
}
