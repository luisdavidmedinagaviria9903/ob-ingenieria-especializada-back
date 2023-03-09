package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.GetComponentSpecsBusiness;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import com.obingenieriaespecializada.automate.service.GetComponentSpecsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetComponentSpecsBusinessImpl implements GetComponentSpecsBusiness {

    private final GetComponentSpecsService componentSpecsService;

    public GetComponentSpecsBusinessImpl(GetComponentSpecsService componentSpecsService) {
        this.componentSpecsService = componentSpecsService;
    }

    @Override
    public List<ComponentTypeDto> getAllComponentsType() {
        return this.componentSpecsService.getAllComponentsType();
    }

    @Override
    public List<ComponentEntryTypeSpecsDto> findAllByComponentType_Code(String code) {
        return this.componentSpecsService.findAllByComponentType_Code(code);
    }
}
