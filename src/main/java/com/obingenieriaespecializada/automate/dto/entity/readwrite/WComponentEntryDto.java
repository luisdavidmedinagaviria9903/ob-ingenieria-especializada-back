package com.obingenieriaespecializada.automate.dto.entity.readwrite;

import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.dto.entity.UserDto;
import com.obingenieriaespecializada.automate.dto.entity.read.RComponentDto;
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
public class WComponentEntryDto implements Serializable {
    private static final long serialVersionUID = -7628085908135157895L;

    private Long id;

    private String observation;

    private LocalDateTime creationDate;

    private Integer creationUser;

    private WComponentDto component;
    @Builder.Default
    private Set<ComponentEntryInventoryDto> inventory = new HashSet<>();
    @Builder.Default
    private Set<ComponentEntryPicturesDto> pictures = new HashSet<>();

}
