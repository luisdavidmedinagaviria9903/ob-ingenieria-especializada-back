package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentEntity, Long> {

    ComponentEntity findFirstByEqEquals(String eq);

    Page<ComponentEntity> findAllByComponentEntry_Client_Id(Long clientId, Pageable pageable);
    Page<ComponentEntity> findAllByStatus(ComponentStatusEnum componentStatusEnum, Pageable pageable);


}
