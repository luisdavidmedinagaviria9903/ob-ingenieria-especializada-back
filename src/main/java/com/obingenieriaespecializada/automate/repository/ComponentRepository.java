package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentEntity, Long> {

    ComponentEntity findFirstByEqEquals(String eq);

}
