/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diesgut.singlespringboot.repository;

import com.diesgut.singlespringboot.model.Persona;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego
 */
@Repository
public interface PersonaJpaRepository extends JpaRepository<Persona, Serializable> {

}
