package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.service.ComponentEntryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Slf4j
public class ComponentEntryBusinessImpl implements ComponentEntryBusiness {

    private final ComponentEntryService componentEntryService;


    public ComponentEntryBusinessImpl(ComponentEntryService componentEntryService) {
        this.componentEntryService = componentEntryService;
    }


    @Override
    public Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry) {

        try {
            componentEntry.setCreationDate(LocalDateTime.now());

            Optional<ComponentEntryDto> isEntrySaved = this.componentEntryService.save(componentEntry);

            if (isEntrySaved.isPresent() && !ObjectUtils.isEmpty(isEntrySaved.get().getId())) {
                isEntrySaved.get().getInventory()
                        .forEach(inventory -> {
                            inventory.setIdComponentEntry(isEntrySaved.get().getId());
                            inventory.setStatus(1);
                        });
                isEntrySaved.get().getPictures()
                        .forEach(picture -> picture.setIdComponentEntry(isEntrySaved.get().getId()));

                this.componentEntryService.saveAllInventory(isEntrySaved.get().getInventory())
                        .ifPresent(inventorySaved -> isEntrySaved.get().setInventory(inventorySaved));
                this.componentEntryService.saveAllPictures(isEntrySaved.get().getPictures())
                        .ifPresent(picturesSaved -> isEntrySaved.get().setPictures(picturesSaved));



                return isEntrySaved;
            }
        }catch (Exception e){
                log.error("ERROR when saving component entry" + e.getMessage() + e.getCause());
        }


        return Optional.empty();
    }
}
