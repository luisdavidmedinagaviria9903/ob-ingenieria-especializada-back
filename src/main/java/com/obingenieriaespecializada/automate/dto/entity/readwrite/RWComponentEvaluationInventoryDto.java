package com.obingenieriaespecializada.automate.dto.entity.readwrite;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class RWComponentEvaluationInventoryDto {

    private Long id;
    private Long idComponentEvaluation;
    private String code;
    private String value;
    private Integer status;
    private String reference;
    private LocalDateTime creationDate;
}
