//Esquema de la entrada: número de casos
import java.util.*;
public class Sombrilla {
	static Scanner in;
		public static int casoDePrueba() {
		int nsombrillas = in.nextInt();
		int d;
		int rt;
		int ntension = 0;
		int array[][] = new int[nsombrillas][3];
		for (int i = 0; i < nsombrillas; i++) { // por cada sombrillas
			array[i][0]= in.nextInt();
			array[i][1]= in.nextInt();
			array[i][2]= in.nextInt();
		}
		for (int i = 0; i > array.length; i++) {
			for(int j = 0; j > array.length; j++) {
				d = (int) Math.sqrt(Math.pow((array[i][0] - array [j][0]), 2) + Math.pow((array[i][1] - array [j][1]), 2));
				rt = array[i][3] - array [j][3];
				  if (d < rt) {
					  ntension++;
				  }
			}
		}
		return ntension;
	}
	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++) {
			System.out.println(casoDePrueba());
		}		
	} // main
}