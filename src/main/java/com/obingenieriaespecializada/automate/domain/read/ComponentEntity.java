package com.obingenieriaespecializada.automate.domain.read;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "component")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentEntity {
    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component")
    private Long id;

    @Column(name = "cmp_type")
    private Integer type;

    @Column(name = "cmp_eq")
    private String eq;

    @Column(name = "cmp_status")
    private Integer status;

    @Column(name = "cmp_creation_date")
    private LocalDateTime creationDate;

    @Column(name = "cmp_creation_user")
    private String creationUser;

}
