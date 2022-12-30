package com.wilmerbaby.healthcheck;
import com.fasterxml.jackson.databind.BeanProperty;
import com.wilmerbaby.healthcheck.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class HealthCheckApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {

		SpringApplication.run(HealthCheckApplication.class, args);
	}
	@Override
	public void run(String...args) throws  Exception {
		String sql = "select * from person";
		List<Person> persons = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Person.class));

		persons.forEach(System.out :: println);

	}

}
