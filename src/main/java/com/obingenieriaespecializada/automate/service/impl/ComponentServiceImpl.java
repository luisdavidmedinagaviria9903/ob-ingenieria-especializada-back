package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentDto;
import com.obingenieriaespecializada.automate.mapper.ComponentMapper;
import com.obingenieriaespecializada.automate.repository.ComponentRepository;
import com.obingenieriaespecializada.automate.service.ComponentService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Service
public class ComponentServiceImpl implements ComponentService {

    private final ComponentRepository componentRepository;
    private final ComponentMapper componentEntryMapper = Mappers.getMapper(ComponentMapper.class);

    public ComponentServiceImpl(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    @Override
    public Optional<ComponentDto> save(ComponentDto componentDto) {
        ComponentEntity save =  this.componentRepository.save(componentEntryMapper.convertTo(componentDto));
       return !ObjectUtils.isEmpty(save) ? Optional.of(componentEntryMapper.convertTo(save)) : Optional.empty();
    }

    @Override
    public Optional<ComponentDto> findFirstByEqEquals(String eq) {
        ComponentEntity component = this.componentRepository.findFirstByEqEquals(eq);
        return !ObjectUtils.isEmpty(component) ? Optional.ofNullable(componentEntryMapper.convertTo(component)) : Optional.empty();
    }
}
