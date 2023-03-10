package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.read.MiscTypeEntity;
import com.obingenieriaespecializada.automate.dto.entity.MiscTypeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MiscTypeMapper {
    MiscTypeDto convertTo(MiscTypeEntity miscTypeEntity);

}
