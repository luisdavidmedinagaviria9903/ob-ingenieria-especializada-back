package com.obingenieriaespecializada.automate.domain.readwrite;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.obingenieriaespecializada.automate.domain.read.UserEntity;
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
public class WComponentEntryEntity {

    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_entry")
    private Long id;


    @Column(name = "cmp_entry_observation")
    private String observation;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;


    @Column(name = "creation_user")
    private Integer creationUser;

    @OneToOne()
    @JoinColumn(name = "id_component", referencedColumnName = "id_component")
    private WComponentEntity component;

    @Builder.Default
    @OneToMany(mappedBy = "idComponentEntry")
    private Set<RWComponentEntryInventoryEntity> inventory  = new HashSet<>();

    @Builder.Default
    @OneToMany(mappedBy = "idComponentEntry")
    private Set<RWComponentEntryPicturesEntity> pictures = new HashSet<>();


}
