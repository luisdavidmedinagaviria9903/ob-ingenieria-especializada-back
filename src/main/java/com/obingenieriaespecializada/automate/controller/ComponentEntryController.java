package com.obingenieriaespecializada.automate.controller;


import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import com.obingenieriaespecializada.automate.business.GetComponentSpecsBusiness;
import com.obingenieriaespecializada.automate.domain.enums.ComponentStatusEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/component-entry")
@CrossOrigin(allowedHeaders = "*")
public class ComponentEntryController {
    private final GetComponentSpecsBusiness getComponentSpecsBusiness;
    private final ComponentEntryBusiness componentEntryBusiness;

    public ComponentEntryController(GetComponentSpecsBusiness getComponentSpecsBusiness,
                                    ComponentEntryBusiness componentEntryBusiness) {
        this.getComponentSpecsBusiness = getComponentSpecsBusiness;
        this.componentEntryBusiness = componentEntryBusiness;
    }

    @GetMapping("/findAll/specs/{spec}")
    public ResponseEntity<Object> findAllComponentEntrySpecs(@PathVariable("spec") String spec){
        return new ResponseEntity<>(this.getComponentSpecsBusiness.findAllByComponentType_Code(spec), HttpStatus.OK);
    }

    @GetMapping("/findAll/by/component/status/{status}")
    public ResponseEntity<Object> findAllComponentEntrySpecs(@PathVariable("status") ComponentStatusEnum componentStatus){
        return new ResponseEntity<>(this.componentEntryBusiness.findAllByComponentStatus(componentStatus), HttpStatus.OK);
    }


}
