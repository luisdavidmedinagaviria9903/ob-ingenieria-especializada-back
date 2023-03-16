package com.obingenieriaespecializada.automate.controller;


import com.obingenieriaespecializada.automate.business.UserBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*")
public class UserController {
    private final UserBusiness userBusiness;

    public UserController(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    @GetMapping(value = "/get/all/clients")
    public ResponseEntity<Object> findAllClients(){
        return  new ResponseEntity<>( this.userBusiness.findAllUserByRol("CLIENT"), HttpStatus.OK);
    }

}
