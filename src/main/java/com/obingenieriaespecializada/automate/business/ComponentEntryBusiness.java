package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;

import java.util.Map;
import java.util.Optional;

public interface ComponentEntryBusiness {

    Map<String, Object> findAll(FindAllEntryParams findAllEntryParams);
    Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry);


}
