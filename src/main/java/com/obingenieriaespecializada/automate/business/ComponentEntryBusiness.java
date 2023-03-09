package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;

import java.util.Map;
import java.util.Optional;

public interface ComponentEntryBusiness {

    Map<String, Object> findAll();
    Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry);


}
