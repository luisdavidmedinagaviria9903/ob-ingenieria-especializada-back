package com.obingenieriaespecializada.automate.dto.entity;


import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ComponentEntryInventoryDto  implements Serializable {

    private static final long serialVersionUID = 4208945794735510640L;

    private Long id;
    private Long idComponentEntry;
    private String code;
    private String value;
    private Integer status;
}
