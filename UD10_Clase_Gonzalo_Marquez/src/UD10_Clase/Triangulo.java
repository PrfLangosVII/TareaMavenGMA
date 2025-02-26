package UD10_Clase;
import UD10_Clase.Figuras.Figura;
public class Triangulo implements Figura {
	public int lado;
	public String tipo;
	public char caracter;
	
	@Override
	public String nombre() {
		return ("Triángulo " + this.tipo+ " de lado " + this.lado);
	}
	@Override
	public void dibujar() {
		if (this.tipo.equals("a")) {
			for (int i = this.lado; i >= 0; i--) {//Para cada i = lado, descendiente hasta 0, imprime i veces caracter
				for (int j = 0; j <= i; j++) {
					System.out.println(this.caracter);
				}
			}
		}
		else if (this.tipo.equals("b")) {
			int espacio = 0;
			for (int i = this.lado; i >= 0; i--) {//Para cada i = lado, descendente hasta 0, imprime i veces caracter con espacio espacios añadidos, ascendente por cada iteración
				for (int j = 0; j <= i; j++) {
					for (int k = 0; k > espacio; k++) {
						System.out.print(" ");
					}
					System.out.println(this.caracter);
				}
				espacio++;
			}
		}
		else if (this.tipo.equals("c")) {
			for (int i = 0; i <= this.lado; i++) {//Para cada i = 0, ascendente hasta lado, imprime i veces caracter
				for (int j = 0; j <= i; j++) {
					System.out.println(this.caracter);
				}
			}
		}
		else if (this.tipo.equals("d")) {
			int espacio = this.lado;
			for (int i = 0; i <= this.lado; i++) {//Para cada i = 0, ascendente hasta lado, imprime i veces caracter con lado espacios añadidos, descendente por cada iteración
				for (int j = 0; j <= i; j++) {
					for (int k = 0; k > espacio; k++) {
						System.out.print(" ");
					}
					System.out.println(this.caracter);
				}
				espacio--;
			}
		}
		else {
			System.err.println("Tipo de triángulo no válido");
		}
	}
	@Override
	public int area() {
		int a = (this.lado * this.lado) / 2;
		return a;
	}
	@Override
	public void setCaracter(char c) {
		this.caracter = c;
	}
	@Override
	public char getCaracter() {
		return this.caracter;
	}
	
	Triangulo(int lado, String tipo, char caracter) {
		this.lado = lado;
		this.tipo = tipo;
		this.caracter = caracter;
	}	
}