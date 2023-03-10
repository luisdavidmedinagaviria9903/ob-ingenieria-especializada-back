package com.obingenieriaespecializada.automate.dto.utility;


import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class FindAllEntryParams extends Pagination{
    private Long clientId;
    private ComponentStatusEnum componentStatusEnum;

}
