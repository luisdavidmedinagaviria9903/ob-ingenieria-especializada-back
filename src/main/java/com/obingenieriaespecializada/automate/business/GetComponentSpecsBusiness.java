package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryTypeSpecsDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentTypeDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventorySpecsDto;

import java.util.List;


public interface GetComponentSpecsBusiness {

    List<ComponentTypeDto> getAllComponentsType();

    List<ComponentEntryTypeSpecsDto> findAllByComponentType_Code(String code);

    List<RWComponentEvaluationInventorySpecsDto> findAllComponentEvaluationSpecs();
}
