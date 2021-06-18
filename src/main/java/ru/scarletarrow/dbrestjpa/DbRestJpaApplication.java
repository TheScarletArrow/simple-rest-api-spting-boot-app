package ru.scarletarrow.dbrestjpa;

import org.hibernate.tool.schema.internal.exec.GenerationTarget;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DbRestJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbRestJpaApplication.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hello!";
    }
}
