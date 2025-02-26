package pack;
public class Ordenador {
	public int ram;
	public String so;
	public String cpu = CPU.name;
	public String screen = Pantalla.name;
	public String mouse = Raton.name;
	public String mk = Teclado.name;
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public void setCpu(String cpu) {
		this.cpu = CPU.name;
	}
	public void setScreen(String screen) {
		this.screen = Pantalla.name;
	}
	public void setMouse(String mouse) {
		this.mouse = Raton.name;
	}
	public void setMk(String mk) {
		this.mk = Teclado.name;
	}
	public String tostring() {
		String prnt = "RAM = " + ram + " SO = " + so + " CPU = " + cpu + " Pantalla = " + screen
				+ " Raton = " + mouse + " Teclado = " + mk;
		return prnt;
	}
	
	public Ordenador(int ram, String so) {
		this.ram = ram;
		this.so = so;
	}
}