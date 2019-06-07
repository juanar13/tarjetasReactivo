package com.tarjetaCredito.tarjetas.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Usuario implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	String id;
	String numTarjeta;
	@NotNull
	String numDocumento;
	String franquicia;
	Double cupoDisponible;
	Double deudaActual;
	String fecha;
	
	public  Usuario(String numTarjeta, String numDocumento,String franquicia, Double cupoDisponible, Double deudaActual, String fecha ) {
		this.numTarjeta = numTarjeta;
		this.numDocumento = numDocumento;
		this.franquicia = franquicia;
		this.cupoDisponible = cupoDisponible;
		this.deudaActual = deudaActual;
		this.fecha = fecha;
		
	}

	public String getnumTarjeta() {
		return numTarjeta;
	}

	public void setnumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getnumDocumento() {
		return numDocumento;
	}

	public void setnumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getfranquicia() {
		return franquicia;
	}

	public void setfranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public Double getcupoDisponible() {
		return cupoDisponible;
	}

	public void setcupoDisponible(Double cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}

	public Double getdeudaActual() {
		return deudaActual;
	}

	public void setdeudaActual(Double deudaActual) {
		this.deudaActual = deudaActual;
	}

	public String getfecha() {
		return fecha;
	}

	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	

	
	
	
	
}
