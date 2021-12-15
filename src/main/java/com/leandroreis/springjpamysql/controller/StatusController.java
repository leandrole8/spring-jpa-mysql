package com.leandroreis.springjpamysql.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping
    public String statusAgora(){

        return "Aplicação está Online!!!Parabéns...";
    }
}