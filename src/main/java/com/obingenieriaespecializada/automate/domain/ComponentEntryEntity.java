package com.obingenieriaespecializada.automate.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "component_entry")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentEntryEntity {

    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_entry")
    private Long id;

    @OneToOne()
    @JoinColumn(name = "id_client", referencedColumnName = "id_user")
    private UserEntity client;

    @Column(name = "cmp_entry_observation")
    private String observation;

    @OneToOne(optional = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "id_component", referencedColumnName = "id_component")
    private ComponentEntity component;

    @OneToMany(mappedBy = "idComponentEntry")
    private Set<ComponentEntryInventoryEntity> inventory;
}
