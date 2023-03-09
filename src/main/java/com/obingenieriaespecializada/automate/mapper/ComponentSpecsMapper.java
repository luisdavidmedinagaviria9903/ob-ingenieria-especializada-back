package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntryInventorySpecsEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryTypeSpecsEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentTypeEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventorySpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentSpecsMapper {

    ComponentTypeDto convertTo(ComponentTypeEntity componentType);
    ComponentEntryInventorySpecsDto convertTo(ComponentEntryInventorySpecsEntity componentEntryInventorySpecsEntity);
    ComponentEntryTypeSpecsDto convertTo(ComponentEntryTypeSpecsEntity componentEntryTypeSpecsEntity);
}
