package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentEntryRepository extends JpaRepository<ComponentEntryEntity, Long> {

    Page<ComponentEntryEntity> findAllByClient_Id(Long clientId, Pageable pageable);
    Page<ComponentEntryEntity> findAllByComponent_Status(ComponentStatusEnum componentStatusEnum, Pageable pageable);
}
