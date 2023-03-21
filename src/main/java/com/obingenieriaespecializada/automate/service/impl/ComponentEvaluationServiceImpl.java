package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEvaluationInventoryEntity;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventoryDto;
import com.obingenieriaespecializada.automate.mapper.ComponentEvaluationMapper;
import com.obingenieriaespecializada.automate.repository.RWComponentEvaluationInventoryRepository;
import com.obingenieriaespecializada.automate.repository.RWComponentEvaluationRepository;
import com.obingenieriaespecializada.automate.service.ComponentEvaluationService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ComponentEvaluationServiceImpl implements ComponentEvaluationService {

    private final RWComponentEvaluationRepository rwComponentEvaluationRepository;
    private final RWComponentEvaluationInventoryRepository rwComponentEvaluationInventoryRepository;

    private final ComponentEvaluationMapper componentEvaluationMapper;

    public ComponentEvaluationServiceImpl(RWComponentEvaluationRepository rwComponentEvaluationRepository,
                                          RWComponentEvaluationInventoryRepository rwComponentEvaluationInventoryRepository, ComponentEvaluationMapper componentEvaluationMapper) {
        this.rwComponentEvaluationRepository = rwComponentEvaluationRepository;
        this.rwComponentEvaluationInventoryRepository = rwComponentEvaluationInventoryRepository;
        this.componentEvaluationMapper = componentEvaluationMapper;
    }


    @Override
    public Optional<RWComponentEvaluationDto> save(RWComponentEvaluationDto rwComponentEvaluationDto) {
        RWComponentEvaluationEntity save = this.rwComponentEvaluationRepository
                .saveAndFlush(this.componentEvaluationMapper.convertTo(rwComponentEvaluationDto));

        return ObjectUtils.isEmpty(save)
                ? Optional.empty()
                : Optional.of(this.componentEvaluationMapper.convertTo(save));
    }

    @Override
    public List<RWComponentEvaluationInventoryDto> save(List<RWComponentEvaluationInventoryDto> rwComponentEvaluationDto) {
        List<RWComponentEvaluationInventoryEntity> save = this.rwComponentEvaluationInventoryRepository
                .saveAllAndFlush(rwComponentEvaluationDto.stream()
                        .map(this.componentEvaluationMapper::convertTo)
                        .collect(Collectors.toList()));

        return save.stream()
                .map(this.componentEvaluationMapper::convertTo)
                .collect(Collectors.toList());
    }
}
