package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;

import java.util.Optional;

public interface ComponentEntryBusiness {

    Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry);


}
