package com.utad.dawe.app;
import com.utad.dawe.model.Clase;
public class Equipo {
	public static void calcStats(Clase j, Clase j2) {
		for (int jornada = 0; jornada <= 10; jornada++) {
			//GET -> SUM -> SET
			int nanotacion, nbloqueo, ntiempo;
			nanotacion = j2.getAnotacion() + 6;
			nbloqueo = j2.getBloqueo() + 23;
			ntiempo = j2.getTiempoJugado() + 3600;
			j2.setAtributos(nanotacion, nbloqueo, ntiempo);
			int nanotacion2, nbloqueo2, ntiempo2;
			nanotacion2 = j.getAnotacion() + 14;
			nbloqueo2 = j.getBloqueo() + 10;
			ntiempo2 = j.getTiempoJugado() + 3600;
			j.setAtributos(nanotacion2, nbloqueo2, ntiempo2);
			if (jornada == 5) {
				System.out.println(j.toString());
				System.out.println(j2.toString());
			}
		}
	}
	
	public static void main(String[] args) {
		Clase j1 = new Clase("Gonzalo", 10);
		Clase j2 = new Clase("Juan", 7);
		j1.setAtributos(154, 110, 39600);
		j2.setAtributos(66, 253, 39600);
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		j1.setAtributos(0, 0, 0);
		j2.setAtributos(0, 0, 0);
		calcStats(j1, j2);
		System.out.println(j1.toString());
		System.out.println(j2.toString());
	}
}