package com.obingenieriaespecializada.automate.dto.entity;


import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class RolDto implements Serializable {

    private static final long serialVersionUID = -9049325997829804602L;

    private Long id;
    private String rolName;
    private String rolDescription;
}
