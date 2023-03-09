package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntryInventorySpecsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentEntryInventorySpecsRepository extends JpaRepository<ComponentEntryInventorySpecsEntity, Long> {
}
