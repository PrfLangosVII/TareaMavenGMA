package pack;
public class Test {
	public static void main(String[] args) {
		CPU.setName("Intel Core i9-14900K");
		Pantalla.setName("ASUS ROG Swift Pro PG248QP");
		Raton.setName("Logitech GPro X Superlight 2");
		Raton.setName("Wooting 60HE");
		Ordenador pc1 = new Ordenador(64, "Windows 11");
		System.out.println(pc1.tostring());
	}
}