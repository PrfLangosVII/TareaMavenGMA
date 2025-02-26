package project;
import project.Interfaces.Pelable;
public class Naranja extends Fruta implements Pelable{
	private boolean pelada = false;
	
	public void pelar() {
		this.pelada = true;
	}
	@Override
	public boolean estaPelada() {
		if (this.pelada == true) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean comer() {
		if (this.pelada == true) {
			System.out.println("Naranja comida");
			return true;
		}
		else {
			System.out.println("Naranja no pelada");
			return false;
		}
	}
	public Naranja(String nombre, double peso, boolean lavada) {
		super(nombre, peso);
		this.pelada = lavada;
	}
}