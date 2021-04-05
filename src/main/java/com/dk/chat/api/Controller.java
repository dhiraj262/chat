package com.dk.chat.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {
    @GetMapping(value = "/")
    public ResponseEntity<String> getDetails() {
        String message = "Dhiraj! you have started some good work";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
