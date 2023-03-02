package com.obingenieriaespecializada.automate.controller;


import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component-entry")
@CrossOrigin(allowedHeaders = "*")
public class ComponentEntryController {

    private final ComponentEntryBusiness componentEntryBusiness;

    public ComponentEntryController(ComponentEntryBusiness componentEntryBusiness) {
        this.componentEntryBusiness = componentEntryBusiness;
    }

    @GetMapping("/findAll")
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<>(this.componentEntryBusiness.findAll(), HttpStatus.OK);
    }
}
