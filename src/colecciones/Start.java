package colecciones;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {

		ArrayList<Planeta> sistemaSolar = new ArrayList();

		System.out.println(sistemaSolar.isEmpty());
		System.out.println(sistemaSolar.size());

		Planeta tierra = new Planeta("Tierra", 345.4d, 3456.3d);
		Planeta mercurio = new Planeta("Mercurio", 3456.43d, 123.67d);
		Planeta venus = new Planeta("Venus", 3456.43d, 123.67d);
		Planeta marte = new Planeta("Marte", 4572.31d, 223.52d);
		Planeta jupiter = new Planeta("Jupiter", 7394.13d, 653.52d);

		try {
			sistemaSolar.add(tierra);
		} catch (PlanetaRepetidoException e1) {

			e1.printStackTrace();
		}
		catch (SistemaSolarLlenoException e2) {
			
			e2.printStackTrace();
		}

		
		
		
		try {
			sistemaSolar.addPlaneta(tierra);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		try {
			sistemaSolar.addPlaneta(mercurio);
		} catch (PlanetaRepetidoException e) {

			e.printStackTrace();
		}
		catch (SistemaSolarLlenoException e) {

			e.printStackTrace();
		}
		

		try {
			sistemaSolar.add(venus);
		} catch (PlanetaRepetidoException e) {

			e.printStackTrace();
		}

		try {
			sistemaSolar.add(marte);
		} catch (PlanetaRepetidoException e) {

			e.printStackTrace();
		}

		try {
			sistemaSolar.add(jupiter);
		} catch (PlanetaRepetidoException e) {

			e.printStackTrace();
		}

		tierra.setNombre("Tierrina");

		System.out.println(sistemaSolar);
		sistemaSolar.ordenar();
		System.out.println(sistemaSolar);

	}

}
