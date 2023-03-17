package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RWComponentEntryRepository extends JpaRepository<RWComponentEntryEntity, Long> {

    List<RWComponentEntryEntity> findAllByComponent_Status(ComponentStatusEnum componentStatus);

}
