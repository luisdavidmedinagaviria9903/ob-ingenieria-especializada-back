package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;

import java.util.Map;
import java.util.Optional;

public interface ComponentService {
    Optional<ComponentDto> save(ComponentDto componentDto);
    Optional<ComponentDto> findFirstByEqEquals(String eq);

    void updateComponentEq(Long componentId, String eq);

    Map<String, Object> findAll(FindAllEntryParams findAllEntryParams);
}
