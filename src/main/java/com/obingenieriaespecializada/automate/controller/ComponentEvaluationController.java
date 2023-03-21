package com.obingenieriaespecializada.automate.controller;

import com.obingenieriaespecializada.automate.business.ComponentEvaluationBusiness;
import com.obingenieriaespecializada.automate.business.GetComponentSpecsBusiness;
import com.obingenieriaespecializada.automate.dto.entity.SaveComponentEvaluationDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/component-evaluation")
@CrossOrigin(allowedHeaders = "*")
public class ComponentEvaluationController {

    private final GetComponentSpecsBusiness getComponentSpecsBusiness;
    private final ComponentEvaluationBusiness componentEvaluationBusiness;

    public ComponentEvaluationController(GetComponentSpecsBusiness getComponentSpecsBusiness,
                                         ComponentEvaluationBusiness componentEvaluationBusiness) {
        this.getComponentSpecsBusiness = getComponentSpecsBusiness;
        this.componentEvaluationBusiness = componentEvaluationBusiness;
    }

    @GetMapping("/findAll/specs")
    public ResponseEntity<Object> findAllComponentEntrySpecs(){
        return new ResponseEntity<>(this.getComponentSpecsBusiness.findAllComponentEvaluationSpecs(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveEntry(@RequestBody SaveComponentEvaluationDto saveComponentEvaluationDto){
        return new ResponseEntity<>(this.componentEvaluationBusiness.save(saveComponentEvaluationDto), HttpStatus.OK);
    }
}
