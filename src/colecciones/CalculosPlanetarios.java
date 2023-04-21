package colecciones;

import java.util.Iterator;

public class CalculosPlanetarios {

	// Calculos planetarios tiene una operacion que se llama distancia media solar
	// Va a recibir un iterador de planetas para calcular la distancia media al sol

	public static double distanciasPlanetarias(Iterator<Planeta> i) {

		double distanciaMedia = 0;
		int cuantos = 0;

		while (i.hasNext()) {

			distanciaMedia += i.next().getDistacia();
			cuantos++;
		}
		distanciaMedia /= cuantos;

		return distanciaMedia;
	}

	// calcular la mayor distancia al sol imprimiendo su nombre
	/**
	 * 
	 * @param i
	 * @return el planeta encontrado y null si no habia ninguno
	 */
	public static Planeta DistanciaMaxima(Iterator<Planeta> i) {

		Planeta devolver = null;

		while (i.hasNext()) {

			Planeta p = i.next();

			if (devolver == null) {

				devolver = p;
			} else if (p.getDistacia() > devolver.getDistacia()) {

				devolver = p;
			}
		}

		return devolver;
	}

}
