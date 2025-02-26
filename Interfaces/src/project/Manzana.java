package project;
import project.Interfaces.Lavable;
public class Manzana extends Fruta implements Lavable{
	private boolean lavada = false;
	
	public void lavar() {
		this.lavada = true;
	}
	@Override
	public boolean estaLimpia() {
		if (this.lavada == true) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean comer() {
		if (this.lavada == true) {
			System.out.println("Manzana comida");
			return true;
		}
		else {
			System.out.println("Manzana no lavada");
			return false;
		}
	}
	public Manzana(String nombre, double peso, boolean lavada) {
		super(nombre, peso);
		this.lavada = lavada;
	}	
}