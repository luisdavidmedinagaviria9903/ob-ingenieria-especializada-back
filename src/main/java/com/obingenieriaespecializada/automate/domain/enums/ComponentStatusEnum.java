package com.obingenieriaespecializada.automate.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ComponentStatusEnum {
    ENTRY(0, "Entry status"),
    GENERAL_EVALUATION(1, "General evaluation"),
    INITIAL_TEST(2, "Initial tests"),
    REPAIR(3, "Repair status" ),
    FINAL_TEST(4, "Final tests"),
    CLOSED(5, "Closed");

    private final Integer index;
    private final String description;

    public static ComponentStatusEnum getByIndex(int index){
        for (ComponentStatusEnum componentStatusEnum : ComponentStatusEnum.values()){
            if (componentStatusEnum.index == index){
                return componentStatusEnum;
            }
        }
        return null;
    }
}
