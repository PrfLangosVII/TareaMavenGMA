package project;
public abstract class Fruta {
	String nombre;
	double peso;
	 
	public double pesar() {
		return peso;
	}
	public abstract boolean comer();
	
	Fruta (String nombre,double peso) {
		this.nombre=nombre;
		this.peso=peso;
	}
}

class Interfaces {
	public interface Pelable {
		public void pelar();
		public boolean estaPelada();
	}
	
	public interface Lavable {
		public void lavar();
		public boolean estaLimpia();
	}
}