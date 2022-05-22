package com.expertostech.tutorialrest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    //metodo levantar servidor online
    @GetMapping(path = "/api/status")
    public  String check(){
        return "Online";
    }
}
