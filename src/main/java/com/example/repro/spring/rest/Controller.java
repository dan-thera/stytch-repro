package com.example.repro.spring.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @RequestMapping(
        value = "/test",
        produces = {"application/json"},
        method = RequestMethod.GET)
    public ResponseEntity test() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
