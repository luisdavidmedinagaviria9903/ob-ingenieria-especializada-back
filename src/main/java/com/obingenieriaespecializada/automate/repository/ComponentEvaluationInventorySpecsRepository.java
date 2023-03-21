package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationInventorySpecsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComponentEvaluationInventorySpecsRepository extends JpaRepository<RWComponentEvaluationInventorySpecsEntity, Long> {

    List<RWComponentEvaluationInventorySpecsEntity> findAllByStatus(Integer status);

}
