package com.obingenieriaespecializada.automate.domain.read;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
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


    @Column(name = "entry_date")
    private LocalDateTime entryDate;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @OneToOne()
    @JoinColumn(name = "id_component", referencedColumnName = "id_component")
    private ComponentEntity component;

    @Builder.Default
    @OneToMany(mappedBy = "idComponentEntry")
    private Set<ComponentEntryInventoryEntity> inventory  = new HashSet<>();

    @Builder.Default
    @OneToMany(mappedBy = "idComponentEntry")
    private Set<ComponentEntryPicturesEntity> pictures = new HashSet<>();


}
