package com.obingenieriaespecializada.automate.dto.entity.readwrite;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class RWComponentEvaluationDto {
    private Long id;
    private Long idComponentEntry;
    private Long idComponent;
    private LocalDateTime creationDate;
    private String observations;
    private String creationUser;
}
