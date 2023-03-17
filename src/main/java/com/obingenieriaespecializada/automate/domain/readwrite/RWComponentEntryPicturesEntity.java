package com.obingenieriaespecializada.automate.domain.readwrite;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "component_entry_pictures")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RWComponentEntryPicturesEntity {

    private static final long serialVersionUID = -5165583824741880724L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_component_pictures")
    private Long id;

    @Column(name = "cmp_url")
    private String url;

    @Column(name = "cmp_name")
    private String name;

    @Column(name = "cmp_description")
    private String description;

    @Column(name = "id_cmp_entry")
    private Long idComponentEntry;


}
