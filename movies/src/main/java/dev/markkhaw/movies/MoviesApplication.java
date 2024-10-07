package dev.markkhaw.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@EnableMongoRepositories("C:/Users/zkhaw/repos/movies")
@SpringBootApplication


public class MoviesApplication {



	public static void main(String[] args) {
//		System.out.println("MONGO_CLUSTER: " + System.getenv("MONGO_CLUSTER"));
//		System.out.println("MONGO_CLUSTER from System.getenv(): " + System.getenv("MONGO_CLUSTER"));
//		System.out.println("MONGO_USER: " + System.getenv("MONGO_USER"));
//		System.out.println("MONGO_DATABASE: " + System.getenv("MONGO_DATABASE"));

		SpringApplication.run(MoviesApplication.class, args);
	}



}
