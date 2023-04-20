package colecciones;

public class Planeta {

	private String nombre;
	private double distancia;
	private double masa;

	public Planeta(String nombre, double distancia, double masa) throws PlanetaImposibleException {

			this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) throws PlanetaImposibleException {

		if (distancia < 1000) {

			PlanetaImposibleException pie = new PlanetaImposibleException("Planeta imposible");
			throw pie;
		}

		this.distancia = distancia;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) throws PlanetaImposibleException {
		
		if (masa < 1000) {

			PlanetaImposibleException pie = new PlanetaImposibleException("Planeta imposible");
			throw pie;
		}
		
		this.masa = masa;
	}

	@Override
	public String toString() {
		return "Planeta [" + nombre + "-" + distancia + "-" + masa + "]";
	}

}
