package com.obingenieriaespecializada.automate.dto.utility;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@SuperBuilder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Pagination {
    @Builder.Default
    private Integer page = 0;
    @Builder.Default
    private Integer size = 25;
    @Builder.Default
    private String sort = "id";
    @Builder.Default
    private String order = "desc";
}
