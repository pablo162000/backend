/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.sevice;

import com.example.demo.repository.model.Persona;
import java.util.List;

/**
 *
 * @author pbsun
 */
public interface IPersonaService {

    public List<Persona> buscarTodos();

}
