package colecciones;

import errores.PlanetaImposibleException;

public class Planeta {

	private String nombre;
	private double distacia;
	private double masa;

	public Planeta(String nombre) {

		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Planeta [" + nombre + " - " + distacia + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public double getDistacia() {
		return distacia;
	}

	public double getMasa() {
		return masa;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDistacia(double distancia) throws PlanetaImposibleException {

		if (distancia < 1000) {

			PlanetaImposibleException pie = new PlanetaImposibleException("Imposible la masa o la distancia");
			throw pie;
		}

		this.distacia = distancia;
	}

	public void setMasa(double masa) throws PlanetaImposibleException {

		if (masa < 1000) {

			PlanetaImposibleException pie = new PlanetaImposibleException("Imposible la masa o la distancia");
			throw pie;
		}

		this.masa = masa;
	}

}
