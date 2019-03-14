package com.diesgut.singlespringboot;

import com.diesgut.singlespringboot.controller.seguridad.usuarios.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SinglespringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SinglespringbootApplication.class, args);
        context.getBean(UsuarioService.class).defaultUser();
    }

}
