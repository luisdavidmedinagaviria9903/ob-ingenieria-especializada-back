package com.obingenieriaespecializada.automate.domain.read;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryPicturesEntity;
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
public class RComponentEntryEntity {

    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_entry")
    private Long id;


    @Column(name = "cmp_entry_observation")
    private String observation;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;


    @OneToOne()
    @JoinColumn(name = "creation_user", referencedColumnName = "id_user")
    private UserEntity creationUser;

    @Column(name = "id_component")
    private Integer component;

    @Builder.Default
    @OneToMany(mappedBy = "idComponentEntry")
    private Set<RWComponentEntryInventoryEntity> inventory  = new HashSet<>();

    @Builder.Default
    @OneToMany(mappedBy = "idComponentEntry")
    private Set<RWComponentEntryPicturesEntity> pictures = new HashSet<>();


}
