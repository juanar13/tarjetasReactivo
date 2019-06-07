package com.tarjetaCredito.tarjetas.repository;



import java.io.Serializable;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.tarjetaCredito.tarjetas.model.Usuario;

//import reactor.core.publisher.Mono;

@Repository
public interface usuarioRepo extends ReactiveMongoRepository <Usuario, Serializable> {
	
	//Mono<Usuario> findBynumTarjeta(String numTarjeta);

}
