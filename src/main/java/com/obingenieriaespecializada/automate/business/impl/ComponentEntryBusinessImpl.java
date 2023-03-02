package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import com.obingenieriaespecializada.automate.service.ComponentEntryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ComponentEntryBusinessImpl implements ComponentEntryBusiness {

    private final ComponentEntryService componentEntryService;

    public ComponentEntryBusinessImpl(ComponentEntryService componentEntryService) {
        this.componentEntryService = componentEntryService;
    }

    @Override
    public Map<String, Object> findAll() {
        return this.componentEntryService.findAll();
    }
}
