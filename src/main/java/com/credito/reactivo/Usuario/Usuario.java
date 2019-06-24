package com.credito.reactivo.Usuario;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {

	@Id
	@NotNull
	private String id;
	private String numTarjeta;
	private String numDocumento;
	private String franquicia;
	private Double cupoDisponible;
	private Double deudaActual;
	private Double monto;
	
	
	public Double getMonto() {
		return monto;
	}


	public void setMonto(Double monto) {
		this.monto = monto;
	}


	public Usuario(String numTarjeta, String numDocumento, String franquicia, Double cupoDisponible, Double deudaActual, Double monto) {
	this.numTarjeta = numTarjeta;
	this.numDocumento = numDocumento;
	this.franquicia = franquicia;
	this.cupoDisponible = cupoDisponible;
	this.deudaActual = deudaActual-monto;
	this.monto = 0.0;
	
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNumTarjeta() {
		return numTarjeta;
	}


	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}


	public String getNumDocumento() {
		return numDocumento;
	}


	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}


	public String getFranquicia() {
		return franquicia;
	}


	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}


	public Double getCupoDisponible() {
		return cupoDisponible;
	}


	public void setCupoDisponible(Double cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}


	public Double getDeudaActual() {
		return deudaActual;
	}


	public void setDeudaActual(Double deudaActual) {
		this.deudaActual = deudaActual;
	}
	
	
	public String ToString() {
		return numTarjeta +numDocumento +franquicia +cupoDisponible +deudaActual +monto;
	}


	
	
	
}
