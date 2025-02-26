package com.utad.dawe.model;
public class Clase {
	private String nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int tiempoJugado;
	
	public void setAtributos(int anotacion, int bloqueo, int tiempoJugado) {
		this.anotacion = anotacion;
		this.bloqueo = bloqueo;
		this.tiempoJugado = tiempoJugado;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public int getAnotacion() {
		return anotacion;
	}
	public int getBloqueo() {
		return bloqueo;
	}
	public int getTiempoJugado() {
		return tiempoJugado;
	}
	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo=" + bloqueo
				+ ", tiempoJugado=" + tiempoJugado + "]";
	}
	
	public Clase (String nombre, int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
	}
}