package UD10_Clase;
import java.util.ArrayList;
import UD10_Clase.Figuras.Figura;
public class Pantalla {
	public ArrayList<Figura> li = new ArrayList<>();
	
	public void add_Figura(Figura fg) {
		li.add(fg);
		fg.dibujar();
	}
	public void modifica_Figura(char c) {
		for (int i = 0; i < li.size(); i++) {
			li.get(i).setCaracter(c);
		}
	}
	public void lista_Figuras() {
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).nombre());
		}
	}
	public void area_Pantalla() {
		int aT = 0;
		for (int i = 0; i < li.size(); i++) {
			int a = li.get(i).area();
			aT += a;//Puede que no funcione
		}
		System.out.println(aT);
	}
	public void muestra_Pantalla() {
		for (int i = 0; i < li.size(); i++) {
			li.get(i).dibujar();
		}
	}
}