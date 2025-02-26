/*Programa para controlar un carrito de la compra para un supermercado
 *Revisar requeriminetos
 *Generar documentación
 *Gonzalo Márquez Alés 06/12/2024 /// 31/12/2024
 */
import java.util.Scanner;
public class Fase1 {
	public static void menu() {
		System.out.println
				 ("|------------------ MENU -----------------|\r\n"
				+ "|    |OP1|          |OP2|      |OP3|      |\r\n"
				+ "|    |OP4|          |OP5|      |OP6|      |\r\n"
				+ "|    |OP7|          |OP8|      |OP9|      |\r\n"
				+ "|                   |OP0|                 |\r\n"
				+ "|-----------------------------------------|\r\n"
				+ "|OP0 --> Nuevo Pedido                     |\r\n"
				+ "|OP1 --> Agregar productos                |\r\n"
				+ "|OP2 --> Ver Productos en Stock           |\r\n"
				+ "|OP3 --> Ver productos en el Carro        |\r\n"
				+ "|OP4 --> Modificar cantidades             |\r\n"
				+ "|OP5 --> Eliminar Producto                |\r\n"
				+ "|OP6 --> Vaciar Carrito                   |\r\n"
				+ "|OP7 --> Terminar Pedido                  |\r\n"
				+ "|OP8 --> Salir                            |\r\n"
				+ "|OP9 --> Ayuda                            |\r\n"
				+ "|-----------------------------------------|\r\n"
				+ "*Introduzca el número de opción\r\n");
	}
	//Cuando no hay ningún producto[idP] en carro
	public static String[] add(String[] carro, String[] producto, int[] cant, int idP) {
		for (int i = 0; i < carro.length; i++) { //Sentencia para nuevo add
			if (carro[i] == null) {
				carro[i] = producto[idP];
				cant[i] = 1;
				System.out.println("Producto agregado a su carro con éxito");
				break;
			}
		}
		return carro;
	}
	//Cuando carro[i].equals(producto[idP])
	public static int[] addC(String[] carro, String[] producto, int[] cant, int idP) {
		for (int i = 0; i < carro.length; i++) { //Sentencia para otro add
			if (carro[i] == producto[idP]) {
				cant[i]++;
				System.out.println("Producto agregado a su carro con éxito");
				break;
			}
		}
		return cant;
	}
	
	public static int[] getCant(int[] cant) {
		return cant;
	}
	
	public static void ver(String[] producto, double[] precios) {
		int c = 0;
		System.out.println("Producto --> ID | Precio");
		System.out.println("------------------------");
		for (int i = 0; i < producto.length; i++) {
			System.out.print(producto[i] + " --> " + c);
			System.out.println(" | " + precios[i] + "€");
			c++;
		}
		System.out.println(c + " Productos totales");
	}
	
	public static void detalles(String[] carro ,int[] cant) {
		int c = 0;
		System.out.println("Producto --> Cantidad");
		System.out.println("---------------------");
		for (int i = 0; i < carro.length; i++) {
			if (carro[i] != null) {
				System.out.println(carro[i] + " --> " + cant[i]);
				c++;
			}
		}
		System.out.println(c + " Productos en el carro");
	}
	
	public static void cantidad(int[] cant, String[] carro) {
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < cant.length; i++) {
			if (carro[i] != null) {
				System.out.print(carro[i] + ", ");
				System.out.println(cant[i] + " Unidades");
			}
		}
		boolean conf = false;
		String confl;
		System.out.println("¿Desea modificar alguna cantidad? (Y / N)");
		if (scn.hasNextLine()) {
			confl = scn.nextLine();
			if (confl.equals("Y") || confl.equals("y")) {
				conf = true;
			}
			if (confl.equals("N") || confl.equals("n")) {
				conf = false;
			}
			if (conf == true) {
				System.out.println("¿Que producto desea modificar (Posición en la lista del carro desde 0)?");
				int i = 0;
				if (scn.hasNextInt()) {
					i = scn.nextInt();
					int namt;
					System.out.println("¿Que cantidad desea?");
					if (scn.hasNextInt()) {
						namt = scn.nextInt();
						cant[i] = namt;
					}
					else {
						System.err.println("Error de entrada");
					}
					
				}
				else {
					System.err.println("Error de entrada");
				}
				
			}
		}
		else {
			System.err.println("Error de entrada");
		}
		
	}
	
	public static String[] eliminar(String[] carro, String[] producto, int[] cant, int idP) {
		System.out.println("Producto eliminado de su carro con éxito");
		elimP(carro, producto, idP);
		elimC(carro, producto, cant, idP);
		return carro;
	}
	
	public static String[] elimP(String[] carro,String[] producto, int idP) {
		for (int i = 0; i < carro.length; i++) {
			if (carro[i] == producto[idP]) {
				carro[i] = null;
				break;
			}
		}
		return carro;
	}
	
	public static int[] elimC(String[] carro, String[] producto, int[] cant, int idP) {
		for (int i = 0; i < carro.length; i++) {
			if (carro[i] == producto[idP]) {
				cant[i] = 0;
				break;
			}
		}
		return cant;
	}
	
	public static String[] vaciar(String[] carro) {
		for (int i = 0; i < carro.length; i++) {
			carro[i] = null;
		}
		System.out.println("Carro vaciado");
		return carro;
	}
	
	public static int[] vaciarCant(int[] cant) {
		for (int i = 0; i < cant.length; i++) {
			cant[i] = 0;
		}
		return cant;
	}
	
	public static void terminar(String[] carro, String[] producto, int[] cant, double[] precios) {
		double precio = 0;
		int[] index = new int[carro.length];
		System.out.println("Operación realizada con éxito");
		System.out.println("Gracias por su compra!");
		//Calculo precio
	    for (int i = 0; i < carro.length; i++) {
	        if (carro[i] != null) {
	            for (int j = 0; j < producto.length; j++) {
	                if (carro[i].equals(producto[j])) {
	                    precio += precios[j] * cant[i];
	                    break;
	                }
	            }
	        }
	    }
		System.out.println();
		System.out.println("Valor del Carro: " + (float) precio + "€");
	}
	
	public static boolean ext(boolean ext) {
		if (ext == true) {
			ext = false;
			return ext;
		}
		else {
			ext = true;
			return ext;
		}
	}
	
	public static void help() {
		System.out.println("Introduzca el número Opción a realizar indicada en el Menú");
		System.out.println("Ejemplo: 2 (Ver Productos)");
		System.out.println("Se recomienda usar la opción 2 para ver el Id de cada producto");
		System.out.println("Use las opciones 1 (Agregar),"
				+ " 3 (Mostrar productos en el carro) y 5 (Eliminar producto del carro)"
				+ " para controlar su carro");
		System.out.println("Use la opción 4 para mostrar las cantidades"
				+ " de cada producto de su carro y modificarlas");
		System.out.println("Use la opción 7 para finalizar el pedido o la opción 0 "
				+ "para iniciar uno nuevo");
		System.out.println("Puede forzar a salir del programa con la opción 8");
		System.out.println("La opción 9 mostrará de nuevo este mensaje");
	}
	
 	public static void main(String[] args) {
		//DATOS
 		Scanner scn = new Scanner(System.in);
		boolean ext = false; //Exit para el bucle principal
 		int tamanocarro = 0; //Tamaño del array carro
 		double[] precios = {0.9, 0.75, 1.7, 0.9, 0.85, 1.1, 0.5, 7.3, 2.35, 1.15, 2.1,
 				2.35, 2.25, 1.85, 0.9, 2.1, 0.75, 6.7, 9.1, 3.5};
		String[] producto = { 
			    "Leche",
			    "Pan",
			    "Huevos",
			    "Arroz",
			    "Pasta",
			    "Azúcar",
			    "Sal",
			    "Aceite de oliva",
			    "Café",
			    "Té",
			    "Manzanas",
			    "Plátanos",
			    "Naranjas",
			    "Tomates",
			    "Lechuga",
			    "Zanahorias",
			    "Patatas",
			    "Pollo",
			    "Carne de ternera",
			    "Pescado"
			};
		System.out.println("Aplicación de carrito de la compra | Gonzalo Márquez Alés");
		System.out.println();
		System.out.println("Añada productos a su carrito usando los Ids de la opción"
				+ " 'Ver productos en Stock (OP2)'");
		System.out.println("Introduzca el número de productos para su carro: ");
		if (scn.hasNextInt()) {
			tamanocarro = scn.nextInt();
			while(tamanocarro < 1) {
				System.err.println("Error de entrada");
				System.out.println("Introduzca el número de productos para su carro: ");
				tamanocarro = scn.nextInt();
			}
		}
		else  {
			System.err.println("Error de entrada");
			ext = true;
		}
		String[] carro = new String[tamanocarro];//Array carro con longitud tamanocarro
		int[] cant = new int[tamanocarro];//Array cantidades con longitud = carro.length 
		//MAIN LOOP
		while (ext == false) { 
			menu();
			int opc = 0;
			if (scn.hasNextInt()) {
				opc = scn.nextInt();
			}
			else  {
				System.err.println("Error de entrada");
				ext = true;
			}
			switch (opc) {
			case 0:
				vaciar(carro);
				vaciarCant(cant);
				break;
			case 1:
				int idP = 0;
				System.out.println("Introduzca Id del Producto a añadir: ");
				if (scn.hasNextInt()) {
					idP = scn.nextInt();
					boolean conf = false;
					for (int i = 0; i < carro.length; i++) {
						if (carro[i] != null && carro[i].equals(producto[idP])) {
							conf = true;
							break;
						}
					}
					if (conf == true) {
						cant = addC(carro, producto, cant, idP);
					}
					else {
						if (carro[tamanocarro - 1] != null) {
							System.out.println("El carro está lleno");
						}
						else {
							carro = add(carro, producto, cant, idP);
						}
					}
				}
				else  {
					System.err.println("Error de entrada");
					ext = true;
				}
				break;
				
			case 2:
				ver(producto, precios);
				break;
				
			case 3:
				detalles(carro, cant);
				break;
				
			case 4:
				cantidad(cant, carro);
				break;
				
			case 5:
				idP = 0;
				System.out.println("Introduzca Id del Producto a Eliminar: ");
				if (scn.hasNextInt()) {
					idP = scn.nextInt();
				}
				else  {
					System.err.println("Error de entrada");
					ext = true;
				}
				eliminar(carro, producto, cant, idP);
				break;
				
			case 6:
				vaciar(carro);
				break;
				
			case 7:
				terminar(carro, producto, cant, precios);
				ext = ext(ext);
				break;
				
			case 8:
				ext = ext(ext);
				break;
				
			case 9:
				help();
				break;
				
			default:
				System.err.println("Error de entrada");
				break;
			}
		}
		scn.close();
	}
}