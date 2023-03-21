package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationInventoryEntity;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventoryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentEvaluationMapper {

    RWComponentEvaluationDto convertTo(RWComponentEvaluationEntity rwComponentEvaluationEntity);
    RWComponentEvaluationEntity convertTo(RWComponentEvaluationDto rwComponentEvaluationDto);

    RWComponentEvaluationInventoryDto convertTo(RWComponentEvaluationInventoryEntity rwComponentEvaluationInventoryEntity);
    RWComponentEvaluationInventoryEntity convertTo(RWComponentEvaluationInventoryDto rwComponentEvaluationInventoryDto);

}
