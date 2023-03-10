package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.MiscTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MiscTypeRepository extends JpaRepository<MiscTypeEntity, Long> {
    List<MiscTypeEntity> findAllByCode(String code);
}
