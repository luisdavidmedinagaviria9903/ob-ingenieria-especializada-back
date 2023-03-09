package com.obingenieriaespecializada.automate.domain.read;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_entry_type_specs")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentEntryTypeSpecsEntity implements Serializable {

    private static final long serialVersionUID = 7046031291432408481L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cmp_entry_type_specs")
    private Long id;

    @OneToOne
    @JoinColumn(name = "cmp_type_code", referencedColumnName = "cmp_type_code")
    private ComponentTypeEntity componentType;

    @OneToOne
    @JoinColumn(name = "cmp_spec_code", referencedColumnName = "cmp_entry_specs_code")
    private ComponentEntryInventorySpecsEntity componentSpec;

    @Column(name = "cmp_entry_spec_required")
    private Boolean required;

    @Column(name = "cmp_entry_type_specs_creation_date")
    private LocalDateTime creationDate;

}
