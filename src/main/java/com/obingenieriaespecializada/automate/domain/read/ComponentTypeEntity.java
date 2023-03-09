package com.obingenieriaespecializada.automate.domain.read;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_type")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentTypeEntity implements Serializable {

    private static final long serialVersionUID = 1129262333355474581L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cmp_type")
    private Long id;

    @Column(name = "cmp_type_code")
    private String code;

    @Column(name = "cmp_type_desc")
    private String description;

    @Column(name = "cmp_type_status")
    private Boolean status;

    @Column(name = "cmp_type_creation_date")
    private LocalDateTime creation_date;
}
