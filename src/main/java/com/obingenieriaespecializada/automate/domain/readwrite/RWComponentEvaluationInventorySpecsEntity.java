package com.obingenieriaespecializada.automate.domain.readwrite;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_evaluation_inventory_specs")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RWComponentEvaluationInventorySpecsEntity {

    private static final long serialVersionUID = -8229261625817864398L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cmp_eval_invt_specs")
    private Long id;

    @Column(name = "cmp_eval_invt_specs_code")
    private String code;

    @Column(name = "cmp_eval_invt_specs_value")
    private String value;

    @Column(name = "cmp_eval_invt_specs_status")
    private Integer status;

    @Column(name = "cmp_eval_invt_specs_type")
    private Integer type;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;


}
