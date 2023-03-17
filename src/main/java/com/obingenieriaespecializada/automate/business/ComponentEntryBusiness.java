package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEntryDto;

import java.util.List;
import java.util.Optional;

public interface ComponentEntryBusiness {

    Optional<RWComponentEntryDto> save(RWComponentEntryDto componentEntry);

    List<RWComponentEntryDto> findAllByComponentStatus(ComponentStatusEnum componentStatus);

}
