package com.obingenieriaespecializada.automate.domain.readwrite;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_evaluation_inventory")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RWComponentEvaluationInventoryEntity {

    private static final long serialVersionUID = 4334721230523817627L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cmp_eval_inventory")
    private Long id;

    @Column(name = "id_cmp_evaluation")
    private Long idComponentEvaluation;

    @Column(name = "cmp_eval_inventory_code")
    private String code;

    @Column(name = "cmp_eval_inventory_value")
    private String value;

    @Column(name = "cmp_eval_inventory_status")
    private Integer status;

    @Column(name = "cmp_eval_inventory_reference")
    private String reference;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;


}
