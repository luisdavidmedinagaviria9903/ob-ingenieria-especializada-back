package com.obingenieriaespecializada.automate.domain.readwrite;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_evaluation")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RWComponentEvaluationEntity {
    private static final long serialVersionUID = -1110058787409733877L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_evaluation")
    private Long id;

    @Column(name = "id_component_entry")
    private Long idComponentEntry;

    @Column(name = "id_component")
    private Long idComponent;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "observations")
    private String observations;

    @Column(name = "creation_user")
    private String creationUser;

}
