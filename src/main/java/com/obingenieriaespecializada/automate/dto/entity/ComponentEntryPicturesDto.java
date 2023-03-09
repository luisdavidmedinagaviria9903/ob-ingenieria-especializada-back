package com.obingenieriaespecializada.automate.dto.entity;


import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentEntryPicturesDto implements Serializable {


    private static final long serialVersionUID = 2415882734183265391L;

    private Long id;
    private String url;
    private String name;
    private String description;
    private Long idComponentEntry;
}
