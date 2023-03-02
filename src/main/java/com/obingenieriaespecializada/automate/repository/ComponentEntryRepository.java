package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.ComponentEntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentEntryRepository extends JpaRepository<ComponentEntryEntity, Long> {
}
