package com.obingenieriaespecializada.automate.repository;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryTypeSpecsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentEntryTypeSpecsRepository  extends JpaRepository<RWComponentEntryTypeSpecsEntity, Long> {


    List<RWComponentEntryTypeSpecsEntity> findAllByComponentType_Code(String code);
}
