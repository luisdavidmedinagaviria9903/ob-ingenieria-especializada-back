package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.MiscTypeDto;

import java.util.List;

public interface MiscTypeService {
    List<MiscTypeDto> findAllByCode(String code);
}
