/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diesgut.singlespringboot.controller.seguridad.usuarios;

import com.diesgut.singlespringboot.model.Persona;
import com.diesgut.singlespringboot.model.Usuario;
import com.diesgut.singlespringboot.repository.PersonaJpaRepository;
import com.diesgut.singlespringboot.repository.UsuarioJpaRepository;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Diego
 */
@Service
@Transactional(readOnly = true)
public class UsuarioServiceImp implements UsuarioService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;

    @Autowired
    PersonaJpaRepository personaJpaRepository;

    @Override
    @Transactional
    public void defaultUser() {
        Usuario defaultUser = usuarioJpaRepository.findByUserName("diesgut");
        if (defaultUser == null) {
            logger.debug("Creara el usuario por defecto");
            Persona persona = new Persona();
            persona.setEmail("diego.esgu@gmail.com");
            LocalDate localDate = LocalDate.of(1988, Month.NOVEMBER, 30);
            persona.setFechaNacimiento(Date.valueOf(localDate));
            persona.setMaterno("Gutierrez");
            persona.setPaterno("E");
            persona.setNombres("Diego");
            persona.setSexo("M");
            personaJpaRepository.save(persona);

            Usuario usuario = new Usuario();
            usuario.setPassword("password");
            usuario.setPersona(persona);
            usuario.setUserName("diesgut");
            usuarioJpaRepository.save(usuario);
        }
    }

}
