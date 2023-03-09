package com.obingenieriaespecializada.automate.dto.entity;


import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class UserDto implements Serializable {

    private static final long serialVersionUID = 7847125183585890211L;

    private Long id;
    private String email;
    private String firstName;
    private String secondName;
    private String document;
    private Integer documentType;
    private Integer phone;
    private RolDto rol;
}
