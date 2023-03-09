package com.obingenieriaespecializada.automate.domain.read;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_entry_inventory_specs")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentEntryInventorySpecsEntity implements Serializable {

    private static final long serialVersionUID = 5428253546250339167L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cmp_entry_specs")
    private Long id;

    @Column(name = "cmp_entry_specs_code")
    private String code;

    @Column(name = "cmp_entry_specs_desc")
    private String description;

    @Column(name = "cmp_entry_specs_status")
    private Boolean status;

    @Column(name = "cmp_entry_specs_creation_date")
    private LocalDateTime creation_date;


}
