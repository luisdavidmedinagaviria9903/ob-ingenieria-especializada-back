package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntryTypeSpecsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentEntryTypeSpecsRepository  extends JpaRepository<ComponentEntryTypeSpecsEntity, Long> {


    List<ComponentEntryTypeSpecsEntity> findAllByComponentType_Code(String code);
}
