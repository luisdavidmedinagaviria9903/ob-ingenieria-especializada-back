package com.obingenieriaespecializada.automate.dto.entity.readwrite;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class RWComponentEvaluationInventorySpecsDto {
    private static final long serialVersionUID = 1253886816628778151L;

    private Long id;
    private String code;
    private String value;
    private Integer status;
    private Integer type;
    private LocalDateTime creationDate;
}
