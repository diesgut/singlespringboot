/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diesgut.singlespringboot.dao.general.hibernate;

import com.diesgut.singlespringboot.dao.general.PersonaDAO;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego
 */
@Repository
public class PersonaDAOH implements PersonaDAO {

    @Autowired
    EntityManager sessionFactory;

    public void PersonaDAOH() {

    }

}
