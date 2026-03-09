package com.example.actividad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.actividad.services.FirebaseService;

@RestController
public class TestController {
    private final FirebaseService firebaseService;
    public TestController(FirebaseService firebaseService) {
    this.firebaseService = firebaseService;
    }
    
    @GetMapping("/firebase-test")   
    public String testFirebase() {
        firebaseService.guardarDato();
        return "Dato enviado a Firebase";   
    }
}