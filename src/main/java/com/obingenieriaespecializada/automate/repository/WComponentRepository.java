package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WComponentRepository extends JpaRepository<RWComponentEntity, Long> {
}
