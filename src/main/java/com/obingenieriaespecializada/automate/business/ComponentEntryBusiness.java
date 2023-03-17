package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.readwrite.WComponentEntryDto;

import java.util.Optional;

public interface ComponentEntryBusiness {

    Optional<WComponentEntryDto> save(WComponentEntryDto componentEntry);


}
