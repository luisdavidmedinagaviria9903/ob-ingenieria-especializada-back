package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;

import java.util.Optional;
import java.util.Set;

public interface ComponentEntryService {


    Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry);
    Optional<Set<ComponentEntryInventoryDto>> saveAllInventory(Set<ComponentEntryInventoryDto> componentEntryInventory);
    Optional<Set<ComponentEntryPicturesDto>> saveAllPictures(Set<ComponentEntryPicturesDto> componentEntryPictures);



}
