package UD10_Clase;
public class Figuras {
	public interface Figura {
		public String nombre();
		public void dibujar();
		public int area();
		public void setCaracter(char c);
		public char getCaracter();
	}
}