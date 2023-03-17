package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryPicturesEntity;
import com.obingenieriaespecializada.automate.domain.readwrite.RWComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.dto.entity.read.RComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEntryDto;
import com.obingenieriaespecializada.automate.mapper.ComponentMapper;
import com.obingenieriaespecializada.automate.repository.ComponentEntryInventoryRepository;
import com.obingenieriaespecializada.automate.repository.ComponentEntryPicturesRepository;
import com.obingenieriaespecializada.automate.repository.RWComponentEntryRepository;
import com.obingenieriaespecializada.automate.service.ComponentEntryService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ComponentEntryServiceImpl implements ComponentEntryService {

    private final RWComponentEntryRepository RWComponentEntryRepository;
    private final ComponentEntryInventoryRepository componentEntryInventoryRepository;
    private final ComponentEntryPicturesRepository componentEntryPicturesRepository;
    private final ComponentMapper componentEntryMapper = Mappers.getMapper(ComponentMapper.class);

    public ComponentEntryServiceImpl(RWComponentEntryRepository RWComponentEntryRepository,
                                     ComponentEntryInventoryRepository componentEntryInventoryRepository,
                                     ComponentEntryPicturesRepository componentEntryPicturesRepository) {
        this.RWComponentEntryRepository = RWComponentEntryRepository;
        this.componentEntryInventoryRepository = componentEntryInventoryRepository;
        this.componentEntryPicturesRepository = componentEntryPicturesRepository;
    }


    @Override
    public Optional<RWComponentEntryDto> save(RWComponentEntryDto componentEntry) {
        RWComponentEntryEntity save = this.RWComponentEntryRepository.saveAndFlush(this.componentEntryMapper.convertTo(componentEntry));
        return !ObjectUtils.isEmpty(save) ? Optional.of(this.componentEntryMapper.convertTo(save)) : Optional.empty();
    }

    @Override
    public Optional<Set<ComponentEntryInventoryDto>> saveAllInventory(Set<ComponentEntryInventoryDto> componentEntryInventory) {

        Set<RWComponentEntryInventoryEntity> mapAll = componentEntryInventory.stream()
                .map(this.componentEntryMapper::convertTo)
                .collect(Collectors.toSet());

        Set<ComponentEntryInventoryDto> save = this.componentEntryInventoryRepository.saveAll(mapAll)
                .stream()
                .map(this.componentEntryMapper::convertTo).collect(Collectors.toSet());

        return !ObjectUtils.isEmpty(save) ? Optional.of(save) : Optional.empty();
    }

    @Override
    public Optional<Set<ComponentEntryPicturesDto>> saveAllPictures(Set<ComponentEntryPicturesDto> componentEntryPictures) {
        Set<RWComponentEntryPicturesEntity> mapAll = componentEntryPictures.stream()
                .map(this.componentEntryMapper::convertTo)
                .collect(Collectors.toSet());

        Set<ComponentEntryPicturesDto> save = this.componentEntryPicturesRepository.saveAll(mapAll)
                .stream()
                .map(this.componentEntryMapper::convertTo).collect(Collectors.toSet());

        return !ObjectUtils.isEmpty(save) ? Optional.of(save) : Optional.empty();
    }

    @Override
    public List<RWComponentEntryDto> findAllByComponentStatus(ComponentStatusEnum componentStatus) {
        return this.RWComponentEntryRepository.findAllByComponent_Status(componentStatus).stream()
                .map(this.componentEntryMapper::convertTo)
                .collect(Collectors.toList());
    }
}
