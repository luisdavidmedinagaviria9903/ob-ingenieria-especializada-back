package com.obingenieriaespecializada.automate.service;

import com.obingenieriaespecializada.automate.dto.entity.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllUserByRol(String rol);
}
