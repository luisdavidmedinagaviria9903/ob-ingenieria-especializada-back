package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface ComponentEntryService {

    Map<String, Object> findAll(FindAllEntryParams findAllEntryParams);

    Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry);
    Optional<Set<ComponentEntryInventoryDto>> saveAllInventory(Set<ComponentEntryInventoryDto> componentEntryInventory);
    Optional<Set<ComponentEntryPicturesDto>> saveAllPictures(Set<ComponentEntryPicturesDto> componentEntryPictures);

}
