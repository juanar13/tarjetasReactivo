package com.tarjetaCredito.tarjetas.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarjetaCredito.tarjetas.model.Usuario;
import com.tarjetaCredito.tarjetas.repository.usuarioRepo;


import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tarjetaCredito")
//@EnableReactiveMongoRepositories("com.tarjetaCredito.tarjetas.repository")
public class Controlador {

	@Autowired
	private usuarioRepo usuariorepositorio;
	
	
	@PostMapping("/usuarionuevo")
	public Mono<Usuario> crearusuario(@RequestBody Usuario usuario) {
	
		return usuariorepositorio.save(usuario);
		 
	}
	
	@GetMapping("/deuda/{id}")
	public Mono<Usuario> getUsuario(@PathVariable("id") String id ) {
		 
		return usuariorepositorio.findById(id);
				
									
		//return usuario.getBynumeroTarjeta(numTarjeta);
		
		
	}
	
}
	
