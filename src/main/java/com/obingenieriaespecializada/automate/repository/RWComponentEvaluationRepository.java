package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RWComponentEvaluationRepository extends JpaRepository<RWComponentEvaluationEntity, Long> {
}
