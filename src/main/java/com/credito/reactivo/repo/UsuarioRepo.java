package com.credito.reactivo.repo;



import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.credito.reactivo.Usuario.Usuario;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public interface UsuarioRepo extends ReactiveMongoRepository<Usuario, String> {

	
	
	
	Mono<Usuario> findFirstByNumTarjeta(String numTarjeta);
	
	Flux<Usuario> findLastByNumTarjeta(String numTarjeta);
	
	String deleteByNumTarjeta(String numTarjeta);
}
