package com.obingenieriaespecializada.automate.dto.entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class MiscTypeDto {
    private Long id;
    private String code;
    private String value;
    private String description;
    private Integer status;
    private LocalDateTime creationDate;
}
