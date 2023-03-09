package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntryPicturesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentEntryPicturesRepository extends JpaRepository<ComponentEntryPicturesEntity, Long> {
}
