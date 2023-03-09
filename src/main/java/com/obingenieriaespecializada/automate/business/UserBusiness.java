package com.obingenieriaespecializada.automate.business;

import com.obingenieriaespecializada.automate.dto.entity.UserDto;

import java.util.List;

public interface UserBusiness {
    List<UserDto> findAllUserByRol(String rol);

}
