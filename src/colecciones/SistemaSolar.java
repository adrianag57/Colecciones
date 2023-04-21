package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import errores.PlanetaRepetidoException;
import errores.SistemaSolarLlenoException;

public class SistemaSolar {

	private ArrayList<Planeta> planetas;

	public SistemaSolar() {

		planetas = new ArrayList<Planeta>();
	}

	public void recorrer() {

//		for(int i = 0; i < planetas.size(); i++) {
//			
//			System.out.println(planetas.get(i).getNombre());
//		}

//			for abreviado en el que se encarga de meter los planetas en la variable p
//		for (Planeta p: planetas) {
//			
//			System.out.println(p.getNombre());
//		}

		// Iterador, es un bucle(en este caso una clase) sobre el que se puede ir
		// avanzando
		// Lo que hacemos con el while es decir que si la i tiene siguiente posicion nos
		// la ponga en p
		// y después pedimos su nombre
		Iterator<Planeta> i = planetas.iterator();

		while (i.hasNext()) {

//			Planeta p = i.next();
//			System.out.println(p.getNombre());

			System.out.println(i.next().getNombre());
		}
	}

	public Iterator<Planeta> getPlanetas() {

		return planetas.iterator();
	}

//		operacion del sistema solar que devuelve la distancia media de los planetas al sol
//		este metodo ya no seria necesario porque ahora lo tenemos en la clase calculos planetarios	
//	public double mediaPlanetaria() {
//		
//		double distanciaMedia = 0;
//		
//		for (Planeta p: planetas) {
//			
//			distanciaMedia += p.getDistacia();
//		}
//		distanciaMedia /= planetas.size();
//		
//		return distanciaMedia;
//	}
//	

	public void addPlaneta(Planeta planeta) throws PlanetaRepetidoException, SistemaSolarLlenoException {

		if (planetas.size() <= 3) {

			if (!planetas.contains(planeta)) {

				planetas.add(planeta);
			}

			else {

				PlanetaRepetidoException error = new PlanetaRepetidoException("Planeta repe");
				throw error;

			}
		} else {

			String texto = "Sistema Solar completo > " + planetas.size();
			SistemaSolarLlenoException error = new SistemaSolarLlenoException(texto);
			throw error;
		}

	}

	public void ordenar() {

		planetas.sort(new ComparadorPlanetas());
	}

	public String toString() {

		return planetas.toString();
	}

}
