package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import errores.PlanetaImposibleException;
import errores.PlanetaRepetidoException;
import errores.SistemaSolarLlenoException;

public class Start {

	public static void main(String[] args) throws SistemaSolarLlenoException  {

		SistemaSolar sistemaSolar = new SistemaSolar();

		Planeta tierra = new Planeta("Tierra");
		Planeta mercurio = new Planeta("Mercurio");
		Planeta venus = new Planeta("Venus");
		Planeta marte = new Planeta("Marte");
		Planeta jupiter = new Planeta("Jupiter");
		
		
		try {
			tierra.setDistacia(3400);
		} catch (PlanetaImposibleException e2) {
			e2.printStackTrace();
		}
		try {
			mercurio.setDistacia(34);
		} catch (PlanetaImposibleException e2) {
			e2.printStackTrace();
		}
		try {
			venus.setDistacia(340);
		} catch (PlanetaImposibleException e2) {
			e2.printStackTrace();
		}
		try {
			marte.setDistacia(34000);
		} catch (PlanetaImposibleException e2) {
			e2.printStackTrace();
		}
		try {
			jupiter.setDistacia(3400000);
		} catch (PlanetaImposibleException e2) {
			e2.printStackTrace();
		}

		
		
		
		try {
			sistemaSolar.addPlaneta(tierra);
		} 
		catch (PlanetaRepetidoException e1) 
		{
			e1.printStackTrace();
		}

		
		

		
		
		try {
			sistemaSolar.addPlaneta(mercurio);
		} 
		catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			sistemaSolar.addPlaneta(venus);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}	
		
		try {
			sistemaSolar.addPlaneta(marte);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}	
		
		try {
			sistemaSolar.addPlaneta(jupiter);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}	
		
		tierra.setNombre("Tierrina");

		System.out.println(sistemaSolar);
		sistemaSolar.ordenar();
		System.out.println(sistemaSolar);

	}

}
