package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.ComponentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentTypeRepository extends JpaRepository<ComponentTypeEntity, Long> {


    List<ComponentTypeEntity> findAllByStatus(Boolean status);

    ComponentTypeEntity findByCode(String code);

}
