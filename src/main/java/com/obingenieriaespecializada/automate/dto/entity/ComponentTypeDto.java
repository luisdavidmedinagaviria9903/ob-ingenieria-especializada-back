package com.obingenieriaespecializada.automate.dto.entity;


import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentTypeDto {

    private Long id;
    private String code;
    private String description;
    private Boolean status;
    private LocalDateTime creation_date;

    private String abbreviation;
}
