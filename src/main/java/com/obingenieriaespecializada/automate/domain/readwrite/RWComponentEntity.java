package com.obingenieriaespecializada.automate.domain.readwrite;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.read.UserEntity;
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
public class RWComponentEntity {
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



}
