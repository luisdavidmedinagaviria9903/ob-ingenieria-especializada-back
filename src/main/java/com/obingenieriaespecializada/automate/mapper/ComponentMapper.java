package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryPicturesEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentMapper {

    ComponentDto convertTo(ComponentEntity component);
    ComponentEntity convertTo(ComponentDto component);

    ComponentEntryDto convertTo(ComponentEntryEntity componentEntry);
    ComponentEntryEntity convertTo(ComponentEntryDto componentEntry);

    ComponentEntryInventoryDto convertTo(ComponentEntryInventoryEntity componentEntryInventory);
    ComponentEntryInventoryEntity convertTo(ComponentEntryInventoryDto componentEntryInventory);

    ComponentEntryPicturesDto convertTo(ComponentEntryPicturesEntity componentEntryPictures);
    ComponentEntryPicturesEntity convertTo(ComponentEntryPicturesDto componentEntryPictures);


}
