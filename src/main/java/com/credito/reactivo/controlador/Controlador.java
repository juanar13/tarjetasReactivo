package com.credito.reactivo.controlador;



import java.time.Duration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.credito.reactivo.Usuario.Usuario;
import com.credito.reactivo.model.Pago;
import com.credito.reactivo.repo.UsuarioRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tarjeta")
public class Controlador {
	
	private UsuarioRepo usuariorepo;
	
	public Controlador(UsuarioRepo usuariorepo) {
		this.usuariorepo = usuariorepo;
	}
	

	@PostMapping("/nuevoregistro")
	public Mono<Usuario>	update(@RequestBody Usuario usuario){
		return usuariorepo.save(usuario);
		
	} 
	
	
	
	@GetMapping("/registros")
	public Flux<Usuario>	getAll(){
		return usuariorepo
				.findAll();
			
	}
	
	@GetMapping("/deuda/{numTarjeta}")
	public Mono<Double>	getdeuda(@PathVariable("numTarjeta") String numTarjeta ){
		
	Mono <Usuario> usuario = this.usuariorepo
					.findFirstByNumTarjeta(numTarjeta);
					return usuario.map(deuda -> deuda.getDeudaActual());
						 
	}
	

	
	@PutMapping("/pago/{numTarjeta}")
	   public Mono<Double> pagar(@PathVariable("numTarjeta")String numTarjeta, @RequestBody Pago pago) { 
		   Double monto = pago.getMonto();
	       Mono<Usuario> p =   this.usuariorepo
	            .findFirstByNumTarjeta(numTarjeta)
	            .map(k -> new Usuario(k.getNumTarjeta(), k.getNumDocumento(),k.getFranquicia(),k.getCupoDisponible(), k.getDeudaActual(), monto))
	            .flatMap(this.usuariorepo::save);
	     
	  	            	

	            
	       
	         return p.map(deuda -> deuda.getDeudaActual());
	            		
	      
	    }
	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
