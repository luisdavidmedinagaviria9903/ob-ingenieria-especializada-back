package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.dto.entity.UserDto;
import com.obingenieriaespecializada.automate.mapper.UserMapper;
import com.obingenieriaespecializada.automate.repository.UserRepository;
import com.obingenieriaespecializada.automate.service.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUserByRol(String rol) {
        return this.userRepository.findAllByRol_RolName(rol)
                .stream().map(this.userMapper::convertTo)
                .collect(Collectors.toList());
    }
}
