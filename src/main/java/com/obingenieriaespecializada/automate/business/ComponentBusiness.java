package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;

import java.util.Map;
import java.util.Optional;

public interface ComponentBusiness {

    Map<String, Object> findAll(FindAllEntryParams findAllEntryParams);
    Optional<RWComponentEntryDto> save(RWComponentEntryDto componentEntryDto);
}
