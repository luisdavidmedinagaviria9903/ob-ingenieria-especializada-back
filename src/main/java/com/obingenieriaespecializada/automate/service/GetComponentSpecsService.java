package com.obingenieriaespecializada.automate.service;


import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;

import java.util.List;

public interface GetComponentSpecsService {

    List<ComponentTypeDto> getAllComponentsType();

    List<ComponentEntryTypeSpecsDto> findAllByComponentType_Code(String code);

}
