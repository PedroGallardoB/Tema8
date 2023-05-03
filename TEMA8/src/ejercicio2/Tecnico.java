package ejercicio2;

public class Tecnico extends Empleado {
	/**
	 * Constructor sin parámetros
	 */
	public Tecnico() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param nombre nombre del técnico
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Pasa los datos del tecnico a String
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre + "-> Tecnico";
	}
}
