package com.obingenieriaespecializada.automate.domain.readwrite;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "component_entry_inventory")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RWComponentEntryInventoryEntity {

    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_entry_inventory")
    private Long id;

    @Column(name = "id_cmp_entry")
    private Long idComponentEntry;

    @Column(name = "cmp_entry_invrty_code")
    private String code;

    @Column(name = "cmp_entry_invrty_value")
    private String value;

    @Column(name = "cmp_entry_invrty_status")
    private Integer status;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

}
