package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;

import java.util.Optional;

public interface ComponentService {
    Optional<ComponentDto> save(ComponentDto componentDto);
    Optional<ComponentDto> findFirstByEqEquals(String eq);
}
