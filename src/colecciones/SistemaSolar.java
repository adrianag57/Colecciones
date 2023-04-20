package colecciones;

import java.util.ArrayList;

public class SistemaSolar {
	
	private ArrayList<Planeta> planetas;

	public SistemaSolar() {
		
		planetas = new ArrayList<Planeta>();
	}
	
	public void addPlaneta(Planeta planeta) 
			throws PlanetaRepetidoException, SistemaSolarLlenoException {
		
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
		SistemaSolarLlenoException error = new SistemaSolarLlenoException(texto);
		throw error;
	}
	
	else	{
		
		if (!masa > 100.00) {
			
			planetas.add(planeta);
		}
		else	{
			
			PlanetaImposibleException error = new PlanetaImposibleException("Planeta imposible");
			throw error;
		}
	}
	


}
