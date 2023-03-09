package com.obingenieriaespecializada.automate.domain.read;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 2352585559157973299L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "user_first_name")
    private String firstName;

    @Column(name = "user_second_name")
    private String secondName;

    @Column(name = "user_document")
    private String document;

    @Column(name = "document_type")
    private Integer documentType;

    @Column(name = "phone")
    private Integer phone;

    @OneToOne()
    @JoinColumn(name = "rol_id", referencedColumnName = "id_rol")
    private RolEntity rol;

    /*@Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;*/


}
