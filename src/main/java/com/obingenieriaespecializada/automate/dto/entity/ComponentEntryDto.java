package com.obingenieriaespecializada.automate.dto.entity;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentEntryDto implements Serializable {
    private static final long serialVersionUID = -7628085908135157895L;

    private Long id;
    private UserDto client;
    private String observation;
    private LocalDateTime entryDate;
    private LocalDateTime creationDate;
    @Builder.Default
    private Set<ComponentEntryInventoryDto> inventory = new HashSet<>();
    @Builder.Default
    private Set<ComponentEntryPicturesDto> pictures = new HashSet<>();

}
