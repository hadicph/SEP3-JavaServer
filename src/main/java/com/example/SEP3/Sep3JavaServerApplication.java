package com.example.SEP3;

import com.example.SEP3.network.connection.DatabaseClient;
import com.example.SEP3.network.connection.IDatabaseClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Sep3JavaServerApplication {

	public static void main(String[] args) {
		IDatabaseClient databaseClient = new DatabaseClient();
		databaseClient.launch();
		SpringApplication.run(Sep3JavaServerApplication.class, args);
	}
}
