package colecciones;

import java.util.ArrayList;

public class SistemaSolar {
	
	private ArrayList<Planeta> planetas;

	public SistemaSolar() {
		
		planetas = new ArrayList<Planeta>();
	}
	
	public void addPlaneta(Planeta planeta) 
			throws Exception {
		
		if (!(planetas.size()<=3)) {
			
			planetas.add(planeta);
		}
		else	{
			
			PlanetaRepetidoException error = new PlanetaRepetidoException("Planeta repe");
			throw error;
		}
	}
	else 	{
			
		String texto = "Sistema Solar completo > " + planetas.size();
		SistemaSolarLLenoException error = new SistemaSolarLLenoException(texto);
		throw error;
	}

}
