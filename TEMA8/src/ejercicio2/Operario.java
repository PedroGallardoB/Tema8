package ejercicio2;
/**
 * Clase que representa a un operario
 * @author Rexil
 *
 */
public class Operario extends Empleado {
	/**
	 * Constructor sin parámetros
	 */
	public Operario() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param nombre nombre del operario
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Pasa los datos del operario a String
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre + "-> Operario";
	}
}
