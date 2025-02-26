package UD10_Clase;
import java.util.Scanner;
public class DibujaPantalla {
	Pantalla screen = new Pantalla();
	Scanner scn = new Scanner(System.in);
	public void anadirFigura() {
		System.out.println("Forma de Figura [1]Rectángulo | [2]Triángulo");
		int f = scn.nextInt();
		if (f == 1) {
			System.out.println("Introduce base, altura y caracter");
			int base = scn.nextInt();
			int altura = scn.nextInt();
			char caracter = scn.nextLine().toCharArray()[1];
			Rectangulo r = new Rectangulo(base, altura, caracter);
			screen.li.add(r);
		}
		else if (f == 2) {
			System.out.println("Introduce lado, tipo y caracter");
			int lado = scn.nextInt();
			char[] ar = scn.nextLine().toCharArray();
			char tipo = ar[1];
			char caracter = ar[2];
			Triangulo r = new Triangulo(lado, tipo, caracter);
			screen.li.add(r);
		}
		else {
			System.err.println("Forma no válida");
		}
	}
	public void modificaFigura() {
		System.out.println("Introduce un nuevo carácter");
		screen.modifica_Figura(scn.nextLine().toCharArray()[1]);
	}
	public static void main(String[] args) {
		
	}
}