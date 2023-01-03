package com.wilmerbaby.healthcheck;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@SpringBootApplication
public class HealthCheckApplication  {
	@Autowired
    RepoPerson repo;
    @GetMapping("/test")
    public String test() {
        Person person= new Person("wilmer","rivera");

        repo.save(person);
        return repo.findAll().stream().findFirst().toString();

    }

	public static void main(String[] args) {

		SpringApplication.run(HealthCheckApplication.class, args);
	}



}
