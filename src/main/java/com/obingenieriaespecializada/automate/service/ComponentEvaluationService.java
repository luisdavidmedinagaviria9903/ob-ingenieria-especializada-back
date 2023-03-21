package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventoryDto;

import java.util.List;
import java.util.Optional;

public interface ComponentEvaluationService {
    Optional<RWComponentEvaluationDto> save(RWComponentEvaluationDto rwComponentEvaluationDto);
    List<RWComponentEvaluationInventoryDto> save(List<RWComponentEvaluationInventoryDto> rwComponentEvaluationInventory);
}
