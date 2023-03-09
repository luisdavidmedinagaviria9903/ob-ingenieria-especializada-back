package com.obingenieriaespecializada.automate.dto.entity;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentDto implements Serializable {
    private static final long serialVersionUID = -1273307993058235109L;
    private Long id;
    private Integer type;
    private String eq;
    private Integer status;
    private LocalDateTime creationDate;
    private String creationUser;
}
