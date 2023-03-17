package com.obingenieriaespecializada.automate.controller;


import com.obingenieriaespecializada.automate.business.GetComponentSpecsBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/component-entry")
@CrossOrigin(allowedHeaders = "*")
public class ComponentEntryController {
    private final GetComponentSpecsBusiness getComponentSpecsBusiness;

    public ComponentEntryController(GetComponentSpecsBusiness getComponentSpecsBusiness) {
        this.getComponentSpecsBusiness = getComponentSpecsBusiness;
    }

    @GetMapping("/findAll/specs/{spec}")
    public ResponseEntity<Object> findAllComponentEntrySpecs(@PathVariable("spec") String spec){
        return new ResponseEntity<>(this.getComponentSpecsBusiness.findAllByComponentType_Code(spec), HttpStatus.OK);
    }



}
