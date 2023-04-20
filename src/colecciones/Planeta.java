package colecciones;

public class Planeta {

	private String nombre;
	private double distancia;
	private double masa;

	public Planeta(String nombre, double distancia, double masa) {

		this.nombre = nombre;
		this.masa = masa;
		this.distancia = distancia;
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

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	@Override
	public String toString() {
		return "Planeta [" + nombre + "-" + distancia + "-" + masa + "]";
	}

}
