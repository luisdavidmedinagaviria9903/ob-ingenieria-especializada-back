package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.MiscTypeDto;

import java.util.List;

public interface MiscTypeBusiness {
    List<MiscTypeDto> findAllByCode(String code);
}
