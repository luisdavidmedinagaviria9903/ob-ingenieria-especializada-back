package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryInventorySpecsEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryTypeSpecsEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentTypeEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationInventorySpecsEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventorySpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventorySpecsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentSpecsMapper {

    ComponentTypeDto convertTo(ComponentTypeEntity componentType);
    ComponentEntryInventorySpecsDto convertTo(RWComponentEntryInventorySpecsEntity RWComponentEntryInventorySpecsEntity);
    ComponentEntryTypeSpecsDto convertTo(RWComponentEntryTypeSpecsEntity RWComponentEntryTypeSpecsEntity);

    RWComponentEvaluationInventorySpecsDto convertTo(RWComponentEvaluationInventorySpecsEntity componentEvaluationInventorySpecsEntity);
}
