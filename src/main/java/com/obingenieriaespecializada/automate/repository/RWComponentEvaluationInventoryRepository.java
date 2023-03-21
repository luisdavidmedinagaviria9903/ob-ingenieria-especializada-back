package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RWComponentEvaluationInventoryRepository extends JpaRepository<RWComponentEvaluationInventoryEntity, Long> {
}
