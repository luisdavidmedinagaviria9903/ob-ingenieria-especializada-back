package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.dto.entity.MiscTypeDto;
import com.obingenieriaespecializada.automate.mapper.MiscTypeMapper;
import com.obingenieriaespecializada.automate.repository.MiscTypeRepository;
import com.obingenieriaespecializada.automate.service.MiscTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MiscTypeServiceImpl implements MiscTypeService {

    private final MiscTypeRepository miscTypeRepository;
    private final MiscTypeMapper miscTypeMapper;

    public MiscTypeServiceImpl(MiscTypeRepository miscTypeRepository, MiscTypeMapper miscTypeMapper) {
        this.miscTypeRepository = miscTypeRepository;
        this.miscTypeMapper = miscTypeMapper;
    }

    @Override
    public List<MiscTypeDto> findAllByCode(String code) {
        return this.miscTypeRepository.findAllByCode(code).stream()
                .map(this.miscTypeMapper::convertTo).collect(Collectors.toList());
    }
}
