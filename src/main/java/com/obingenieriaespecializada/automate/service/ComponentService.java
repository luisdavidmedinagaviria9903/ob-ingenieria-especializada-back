package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;

import java.util.Map;
import java.util.Optional;

public interface ComponentService {
    Optional<RWComponentDto> save(RWComponentDto RComponentDto);

    void updateComponentEq(Long componentId, String eq);

    Map<String, Object> findAll(FindAllEntryParams findAllEntryParams);
}
