/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.repository.model.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonaRepositoryImpl implements IPersonaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Persona> buscarTodos() {
        TypedQuery<Persona> myQuery = this.entityManager.createQuery(
                "SELECT p FROM Persona p", Persona.class);
        List<Persona> personas = myQuery.getResultList();

        return personas;
    }

}
