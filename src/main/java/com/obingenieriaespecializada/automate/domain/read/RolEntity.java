package com.obingenieriaespecializada.automate.domain.read;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rol")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RolEntity implements Serializable {


    private static final long serialVersionUID = 3663306096961582526L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id;

    @Column(name = "rol_name")
    private String rolName;

    @Column(name = "rol_description")
    private String rolDescription;

}
