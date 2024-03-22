/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author pbsun
 */
@Entity
@Table(name = "persona")

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_id_seq")
    @SequenceGenerator(name = "pers_id_seq", sequenceName = "pers_id_seq", allocationSize = 1)
    @Column(name = "pers_id")
    private Integer id;
    @Column(name = "pers_name")

    private String name;
    
    
    @Column(name = "pers_apellidos")

    private String apellidos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    

}
