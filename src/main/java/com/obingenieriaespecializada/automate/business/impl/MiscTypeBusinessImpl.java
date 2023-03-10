package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.MiscTypeBusiness;
import com.obingenieriaespecializada.automate.dto.entity.MiscTypeDto;
import com.obingenieriaespecializada.automate.service.MiscTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiscTypeBusinessImpl implements MiscTypeBusiness {

    private final MiscTypeService miscTypeService;

    public MiscTypeBusinessImpl(MiscTypeService miscTypeService) {
        this.miscTypeService = miscTypeService;
    }

    @Override
    public List<MiscTypeDto> findAllByCode(String code) {
        return this.miscTypeService.findAllByCode(code);
    }
}
