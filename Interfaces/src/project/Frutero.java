package project;
import java.util.ArrayList;
public class Frutero {
	public ArrayList<Fruta> frutero = new ArrayList<>();
	
	public void anadir(Fruta a) {
		this.frutero.add(a);
	}
	
	public static void main(String[] args) {
		Frutero frutero1 = new Frutero();
		Manzana mz1 = new Manzana("Manzana1", 200, false);
		Naranja nj1 = new Naranja("Naranja1", 122, true);
		frutero1.anadir(mz1);
		frutero1.anadir(nj1);
		for (int i = 0; i < frutero1.frutero.size(); i++) {
			frutero1.frutero.get(i).comer();
			
		}
	}
}