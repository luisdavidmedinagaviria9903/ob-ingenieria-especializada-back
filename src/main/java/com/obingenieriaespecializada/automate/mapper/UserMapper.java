package com.obingenieriaespecializada.automate.mapper;

import com.obingenieriaespecializada.automate.domain.read.UserEntity;
import com.obingenieriaespecializada.automate.dto.entity.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDto convertTo(UserEntity userEntity);
    UserEntity convertTo(UserDto userDto);
}
