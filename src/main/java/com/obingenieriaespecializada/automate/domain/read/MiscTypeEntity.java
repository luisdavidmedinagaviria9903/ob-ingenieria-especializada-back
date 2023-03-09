package com.obingenieriaespecializada.automate.domain.read;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "misc_type")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MiscTypeEntity {

    private static final long serialVersionUID = -3414887349376131002L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_misc_type")
    private Long id;

    @Column(name = "msty_code")
    private String code;

    @Column(name = "msty_value")
    private String value;

    @Column(name = "msty_desc")
    private String description;

    @Column(name = "msty_status")
    private Integer status;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;


}
