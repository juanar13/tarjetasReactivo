package com.credito.reactivo.model;

public class Pago {

	private String numTarjeta;
	private Double monto;
	
	public Pago() {
		
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
}
