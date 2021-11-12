package com.realstate.HW3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Hw3Application implements CommandLineRunner {

	@Autowired
	UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(Hw3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userDao.persist();
	}
}
