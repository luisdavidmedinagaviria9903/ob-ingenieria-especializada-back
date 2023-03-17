package com.obingenieriaespecializada.automate.dto.entity.readwrite;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.dto.entity.UserDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class WComponentDto implements Serializable {
    private static final long serialVersionUID = -1273307993058235109L;
    private Long id;
    private String type;
    private String eq;
    private ComponentStatusEnum status;

    private Integer client;

    private LocalDateTime entryDate;

    private LocalDateTime creationDate;
}
