package com.obingenieriaespecializada.automate.dto.entity;

import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventoryDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class SaveComponentEvaluationDto {

    private RWComponentEvaluationDto componentEvaluationDto;
    private List<RWComponentEvaluationInventoryDto> componentEvaluationInventory;

}
