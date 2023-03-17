package com.obingenieriaespecializada.automate.domain.read;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "component")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RComponentEntity {
    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component")
    private Long id;

    @Column(name = "cmp_type")
    private String type;

    @Column(name = "cmp_eq")
    private String eq;

    @Column(name = "cmp_status")
    private ComponentStatusEnum status;

    @OneToOne()
    @JoinColumn(name = "id_client", referencedColumnName = "id_user")
    private UserEntity client;

    @Column(name = "cmp_entry_date")
    private LocalDateTime entryDate;

    @Column(name = "cmp_creation_date")
    private LocalDateTime creationDate;

    @OneToOne
    @JoinColumn(name = "id_component", referencedColumnName = "id_component")
    private RComponentEntryEntity componentEntry;



}
