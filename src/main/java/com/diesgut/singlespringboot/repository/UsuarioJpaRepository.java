/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diesgut.singlespringboot.repository;

import com.diesgut.singlespringboot.model.Usuario;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego
 */
@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Serializable> {

    public abstract Usuario findByUserName(String userName);

    public abstract Usuario findByUserNameAndPassword(String userName, String password);

    public abstract List<Usuario> findByUserNameOrderByUserName(String userName);

}
