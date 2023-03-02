package com.obingenieriaespecializada.automate.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentEntryDto implements Serializable {
    private static final long serialVersionUID = -7628085908135157895L;

    private Long id;
    private String inventoryCode;
    private String inventoryValue;
    private String observation;
    private ComponentDto component;

}
