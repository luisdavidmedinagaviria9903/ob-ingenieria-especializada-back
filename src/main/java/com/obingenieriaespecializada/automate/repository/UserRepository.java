package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findAllByRol_RolName(String rol);
}
