/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.sevice;

import com.example.demo.repository.IPersonaRepository;
import com.example.demo.repository.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pbsun
 */
@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private IPersonaRepository repository;
    
    @Override
    public List<Persona> buscarTodos() {
    
        return this.repository.buscarTodos();
    
    }
    
}
