package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.read.RComponentEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.WComponentEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.WComponentEntryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryPicturesEntity;
import com.obingenieriaespecializada.automate.dto.entity.read.RComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.WComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.WComponentEntryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentMapper {

    RComponentDto convertTo(RComponentEntity component);

    RComponentEntity convertTo(RComponentDto component);
    WComponentEntity convertTo(WComponentDto component);

    WComponentDto convertTo(WComponentEntity component);

    WComponentEntryDto convertTo(WComponentEntryEntity componentEntry);
    WComponentEntryEntity convertTo(WComponentEntryDto componentEntry);

    ComponentEntryInventoryDto convertTo(RWComponentEntryInventoryEntity componentEntryInventory);
    RWComponentEntryInventoryEntity convertTo(ComponentEntryInventoryDto componentEntryInventory);

    ComponentEntryPicturesDto convertTo(RWComponentEntryPicturesEntity componentEntryPictures);
    RWComponentEntryPicturesEntity convertTo(ComponentEntryPicturesDto componentEntryPictures);


}
