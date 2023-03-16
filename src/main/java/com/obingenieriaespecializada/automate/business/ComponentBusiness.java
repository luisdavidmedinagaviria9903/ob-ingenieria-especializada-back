package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;

import java.util.Map;
import java.util.Optional;

public interface ComponentBusiness {

    Map<String, Object> findAll(FindAllEntryParams findAllEntryParams);
    Optional<ComponentDto> save(ComponentDto componentDto);
}
