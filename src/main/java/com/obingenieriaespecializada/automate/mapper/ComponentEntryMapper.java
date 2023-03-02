package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.ComponentEntryEntity;
import com.obingenieriaespecializada.automate.dto.ComponentEntryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComponentEntryMapper {

    ComponentEntryDto convertTo(ComponentEntryEntity componentEntry);
    ComponentEntryEntity convertTo(ComponentEntryDto componentEntry);
}
