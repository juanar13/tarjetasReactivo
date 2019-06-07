package com.tarjetaCredito.tarjetas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@ComponentScan(basePackages="com.tarjetaCredito.tarjetas")
@EnableReactiveMongoRepositories("com.tarjetaCredito.tarjetas.repository")
@EntityScan("com.tarjetaCredito.tarjetas.Usuario")
@SpringBootApplication
public class TarjetasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetasApplication.class, args);
	}

}
