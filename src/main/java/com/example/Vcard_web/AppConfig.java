package com.example.Vcard_web;

import com.example.Vcard_web.models.domain.Empleado;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Empleado> registrarItemsFac(){

        Empleado e1 = new
                Empleado(
                "Paola",
                "Criollo",
                "priscilapaolacg@gmail.com",
                "0992664667",
                "Gerente",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png");

        Empleado e2 = new
                Empleado(
                "Edisson",
                "Herrera",
                "eherrera@gmail.com",
                "0999964650",
                "Marketing",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png");

        return Arrays.asList(e1,e2);
    }

}
