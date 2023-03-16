package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.read.ComponentEntryEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryInventoryEntity;
import com.obingenieriaespecializada.automate.domain.read.ComponentEntryPicturesEntity;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryInventoryDto;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryPicturesDto;
import com.obingenieriaespecializada.automate.mapper.ComponentMapper;
import com.obingenieriaespecializada.automate.repository.ComponentEntryInventoryRepository;
import com.obingenieriaespecializada.automate.repository.ComponentEntryPicturesRepository;
import com.obingenieriaespecializada.automate.repository.ComponentEntryRepository;
import com.obingenieriaespecializada.automate.service.ComponentEntryService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ComponentEntryServiceImpl implements ComponentEntryService {

    private final ComponentEntryRepository componentEntryRepository;
    private final ComponentEntryInventoryRepository componentEntryInventoryRepository;
    private final ComponentEntryPicturesRepository componentEntryPicturesRepository;
    private final ComponentMapper componentEntryMapper = Mappers.getMapper(ComponentMapper.class);

    public ComponentEntryServiceImpl(ComponentEntryRepository componentEntryRepository,
                                     ComponentEntryInventoryRepository componentEntryInventoryRepository,
                                     ComponentEntryPicturesRepository componentEntryPicturesRepository) {
        this.componentEntryRepository = componentEntryRepository;
        this.componentEntryInventoryRepository = componentEntryInventoryRepository;
        this.componentEntryPicturesRepository = componentEntryPicturesRepository;
    }


    @Override
    public Optional<ComponentEntryDto> save(ComponentEntryDto componentEntry) {
        ComponentEntryEntity save = this.componentEntryRepository.saveAndFlush(this.componentEntryMapper.convertTo(componentEntry));
        return !ObjectUtils.isEmpty(save) ? Optional.of(this.componentEntryMapper.convertTo(save)) : Optional.empty();
    }

    @Override
    public Optional<Set<ComponentEntryInventoryDto>> saveAllInventory(Set<ComponentEntryInventoryDto> componentEntryInventory) {

        Set<ComponentEntryInventoryEntity> mapAll = componentEntryInventory.stream()
                .map(this.componentEntryMapper::convertTo)
                .collect(Collectors.toSet());

        Set<ComponentEntryInventoryDto> save = this.componentEntryInventoryRepository.saveAll(mapAll)
                .stream()
                .map(this.componentEntryMapper::convertTo).collect(Collectors.toSet());

        return !ObjectUtils.isEmpty(save) ? Optional.of(save) : Optional.empty();
    }

    @Override
    public Optional<Set<ComponentEntryPicturesDto>> saveAllPictures(Set<ComponentEntryPicturesDto> componentEntryPictures) {
        Set<ComponentEntryPicturesEntity> mapAll = componentEntryPictures.stream()
                .map(this.componentEntryMapper::convertTo)
                .collect(Collectors.toSet());

        Set<ComponentEntryPicturesDto> save = this.componentEntryPicturesRepository.saveAll(mapAll)
                .stream()
                .map(this.componentEntryMapper::convertTo).collect(Collectors.toSet());

        return !ObjectUtils.isEmpty(save) ? Optional.of(save) : Optional.empty();
    }
}
