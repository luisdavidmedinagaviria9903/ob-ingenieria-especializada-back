package com.obingenieriaespecializada.automate.controller;

import com.obingenieriaespecializada.automate.business.MiscTypeBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/misc-type")
@CrossOrigin(allowedHeaders = "*")
public class MiscTypeController {

    private final MiscTypeBusiness miscTypeBusiness;

    public MiscTypeController(MiscTypeBusiness miscTypeBusiness) {
        this.miscTypeBusiness = miscTypeBusiness;
    }

    @GetMapping("/findBy/code/{code}")
    public ResponseEntity<Object> findByCode(@PathVariable("code") String code){
        return  new ResponseEntity<>(this.miscTypeBusiness.findAllByCode(code), HttpStatus.OK);
    }
}
