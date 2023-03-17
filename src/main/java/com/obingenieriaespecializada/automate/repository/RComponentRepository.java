package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.read.RComponentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RComponentRepository extends JpaRepository<RComponentEntity, Long> {

    RComponentEntity findFirstByEqEquals(String eq);

    Page<RComponentEntity> findAllByClient_Id(Long clientId, Pageable pageable);
    Page<RComponentEntity> findAllByStatus(ComponentStatusEnum componentStatusEnum, Pageable pageable);


}
