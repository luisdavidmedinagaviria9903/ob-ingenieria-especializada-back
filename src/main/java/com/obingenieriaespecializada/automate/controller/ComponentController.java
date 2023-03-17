package com.obingenieriaespecializada.automate.controller;


import com.obingenieriaespecializada.automate.business.ComponentBusiness;
import com.obingenieriaespecializada.automate.business.GetComponentSpecsBusiness;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.WComponentEntryDto;
import com.obingenieriaespecializada.automate.dto.utility.FindAllEntryParams;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/component")
@CrossOrigin(allowedHeaders = "*")
public class ComponentController {


    private final ComponentBusiness componentBusiness;
    private final GetComponentSpecsBusiness getComponentSpecsBusiness;

    public ComponentController(ComponentBusiness componentBusiness, GetComponentSpecsBusiness getComponentSpecsBusiness) {
        this.componentBusiness = componentBusiness;
        this.getComponentSpecsBusiness = getComponentSpecsBusiness;
    }


    @PostMapping("/findAll")
    public ResponseEntity<Object> findAll(@RequestBody FindAllEntryParams findAllEntryParams){
        return new ResponseEntity<>(this.componentBusiness.findAll(findAllEntryParams), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveEntry(@RequestBody WComponentEntryDto componentEntryDto){
        return new ResponseEntity<>(this.componentBusiness.save(componentEntryDto), HttpStatus.OK);
    }

    @GetMapping("/findAll/component/type")
    public ResponseEntity<Object> findAllComponentType(){
        return new ResponseEntity<>(this.getComponentSpecsBusiness.getAllComponentsType(), HttpStatus.OK);
    }



}
