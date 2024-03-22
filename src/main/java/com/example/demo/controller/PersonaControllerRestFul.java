/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.repository.model.Persona;
import com.example.demo.sevice.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin
public class PersonaControllerRestFul {

    
    @Autowired
	private IPersonaService personaService;
    @GetMapping
    public ResponseEntity<List<Persona>> buscarTodos() {

        List<Persona> lista = this.personaService.buscarTodos();

        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("detallemensjae", "Ciudadanos consultados exitosamente");
        cabeceras.add("valorAPI", "incalculable");
        return new ResponseEntity<>(lista, cabeceras, 228);

    }

}
