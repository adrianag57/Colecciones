package colecciones;

import java.util.ArrayList;
import java.util.List;

import errores.PlanetaRepetidoException;
import errores.SistemaSolarLlenoException;

public class SistemaSolar {

	private ArrayList<Planeta> planetas;
	
	
	public SistemaSolar() {
		
		planetas = new ArrayList<Planeta>();
	}
	
	
	

	public void addPlaneta(Planeta planeta) 
			throws PlanetaRepetidoException, SistemaSolarLlenoException
	{

		if(planetas.size()<=3) {
			
			if(!planetas.contains(planeta)) {
			
				planetas.add(planeta);
			}
			
			else  {
				
				PlanetaRepetidoException error = new PlanetaRepetidoException("Planeta repe");
				throw error;
				
			}
		}
		else {
			
			String texto = "Sistema Solar completo > "+planetas.size();
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
