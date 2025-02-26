package UD10_Clase;
import UD10_Clase.Figuras.Figura;
public class Rectangulo implements Figura {
	public int base;
	public int altura;
	public char caracter;
	
	@Override
	public String nombre() {
		return ("Rectángulo de" + this.base + " x " + this.altura);
	}
	@Override
	public void dibujar() {
		for (int i = 0; i <= this.altura; i++) {
			for (int j = 0; j <= this.base; j++) {
				System.out.println(this.caracter);
			}
		}
	}
	@Override
	public int area() {
		int a = this.base * this.altura;
		return a;
	}
	@Override
	public void setCaracter(char c) {
		this.caracter = c;
	}
	@Override
	public char getCaracter() {
		return caracter;
	}
	
	Rectangulo (int base, int altura, char caracter) {
		this.base = base;
		this.altura = altura;
		this.caracter = caracter;
	}	
}