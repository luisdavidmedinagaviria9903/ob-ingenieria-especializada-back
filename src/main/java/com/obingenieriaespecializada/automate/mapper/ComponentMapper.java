package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.read.RComponentEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryPicturesEntity;
import com.obingenieriaespecializada.automate.dto.entity.read.RComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEntryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentMapper {

    RComponentDto convertTo(RComponentEntity component);

    RComponentEntity convertTo(RComponentDto component);
    RWComponentEntity convertTo(RWComponentDto component);

    RWComponentDto convertTo(RWComponentEntity component);

    RWComponentEntryDto convertTo(RWComponentEntryEntity componentEntry);
    RWComponentEntryEntity convertTo(RWComponentEntryDto componentEntry);

    ComponentEntryInventoryDto convertTo(RWComponentEntryInventoryEntity componentEntryInventory);
    RWComponentEntryInventoryEntity convertTo(ComponentEntryInventoryDto componentEntryInventory);

    ComponentEntryPicturesDto convertTo(RWComponentEntryPicturesEntity componentEntryPictures);
    RWComponentEntryPicturesEntity convertTo(ComponentEntryPicturesDto componentEntryPictures);


}
