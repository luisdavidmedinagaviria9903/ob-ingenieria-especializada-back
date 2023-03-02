package com.obingenieriaespecializada.automate.service.impl;

import com.obingenieriaespecializada.automate.domain.ComponentEntryEntity;
import com.obingenieriaespecializada.automate.repository.ComponentEntryRepository;
import com.obingenieriaespecializada.automate.service.ComponentEntryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class ComponentEntryServiceImpl implements ComponentEntryService {

    private final ComponentEntryRepository componentEntryRepository;

    public ComponentEntryServiceImpl(ComponentEntryRepository componentEntryRepository) {
        this.componentEntryRepository = componentEntryRepository;
    }

    @Override
    public Map<String, Object> findAll() {

        Map<String, Object> result = new HashMap<>();

        Pageable pageable = PageRequest.of(0,100, Sort.by("id").descending());

        Page<ComponentEntryEntity> query = this.componentEntryRepository.findAll(pageable);

        if (!ObjectUtils.isEmpty(query)){
            result.put("items", query.getContent());
            result.put("currentPage", query.getNumber());
            result.put("totalItems", query.getTotalElements());
            result.put("totalPages", query.getTotalPages());
        }

        return result;
    }
}
