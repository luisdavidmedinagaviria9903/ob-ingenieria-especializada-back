package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.SaveComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationDto;

import java.util.Optional;

public interface ComponentEvaluationBusiness {

    Optional<SaveComponentEvaluationDto> save(SaveComponentEvaluationDto saveComponentEvaluationDto);
}
