package com.obingenieriaespecializada.automate.dto.entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentEntryTypeSpecsDto {

    private Long id;
    private ComponentTypeDto componentType;
    private ComponentEntryInventorySpecsDto componentSpec;
    private Boolean required;
    private LocalDateTime creationDate;
}
