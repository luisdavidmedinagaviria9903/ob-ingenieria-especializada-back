package com.obingenieriaespecializada.automate.domain.read;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationInventoryEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "component_evaluation")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RComponentEvaluationEntity {
    private static final long serialVersionUID = -2724725991434734222L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_evaluation")
    private Long id;

    @Column(name = "id_component_entry")
    private Integer idComponentEntry;

    @Column(name = "id_component")
    private Integer component;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "observations")
    private String observations;

    @Column(name = "creation_user")
    private String creationUser;

    /*@Builder.Default
    @OneToMany(mappedBy = "idComponentEvaluation")
    private Set<RWComponentEvaluationInventoryEntity> inventory  = new HashSet<>();*/

}
