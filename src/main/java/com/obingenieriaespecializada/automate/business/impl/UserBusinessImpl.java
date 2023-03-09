package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.UserBusiness;
import com.obingenieriaespecializada.automate.dto.entity.UserDto;
import com.obingenieriaespecializada.automate.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBusinessImpl implements UserBusiness {
    private final UserService userService;

    public UserBusinessImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserDto> findAllUserByRol(String rol) {
        return this.userService.findAllUserByRol(rol);
    }
}
