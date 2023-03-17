package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.RComponentEntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RComponentEntryRepository extends JpaRepository<RComponentEntryEntity, Long> {


}
