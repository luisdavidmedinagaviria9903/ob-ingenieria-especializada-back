package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.dto.entity.read.RComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEntryDto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ComponentEntryService {


    Optional<RWComponentEntryDto> save(RWComponentEntryDto componentEntry);
    Optional<Set<ComponentEntryInventoryDto>> saveAllInventory(Set<ComponentEntryInventoryDto> componentEntryInventory);
    Optional<Set<ComponentEntryPicturesDto>> saveAllPictures(Set<ComponentEntryPicturesDto> componentEntryPictures);

    List<RWComponentEntryDto> findAllByComponentStatus(ComponentStatusEnum componentStatus);



}
