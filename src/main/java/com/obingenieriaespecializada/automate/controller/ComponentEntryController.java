package com.obingenieriaespecializada.automate.controller;


import com.obingenieriaespecializada.automate.business.ComponentEntryBusiness;
import com.obingenieriaespecializada.automate.business.GetComponentSpecsBusiness;
import com.obingenieriaespecializada.automate.dto.entity.ComponentEntryDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/component-entry")
@CrossOrigin(allowedHeaders = "*")
public class ComponentEntryController {

    private final ComponentEntryBusiness componentEntryBusiness;
    private final GetComponentSpecsBusiness getComponentSpecsBusiness;

    public ComponentEntryController(ComponentEntryBusiness componentEntryBusiness,
                                    GetComponentSpecsBusiness getComponentSpecsBusiness) {
        this.componentEntryBusiness = componentEntryBusiness;
        this.getComponentSpecsBusiness = getComponentSpecsBusiness;
    }

    @GetMapping("/findAll")
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<>(this.componentEntryBusiness.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveEntry(@RequestBody ComponentEntryDto componentEntryDto){
        return new ResponseEntity<>(this.componentEntryBusiness.save(componentEntryDto), HttpStatus.OK);
    }

    @GetMapping("/findAll/component/type")
    public ResponseEntity<Object> findAllComponentType(){
        return new ResponseEntity<>(this.getComponentSpecsBusiness.getAllComponentsType(), HttpStatus.OK);
    }

    @GetMapping("/findAll/specs/{spec}")
    public ResponseEntity<Object> findAllComponentEntrySpecs(@PathVariable("spec") String spec){
        return new ResponseEntity<>(this.getComponentSpecsBusiness.findAllByComponentType_Code(spec), HttpStatus.OK);
    }

}
