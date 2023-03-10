package com.obingenieriaespecializada.automate.dto.utility;


import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class FindAllEntryParams extends Pagination{
    private Long clientId;
    private Integer componentStatus;

}
