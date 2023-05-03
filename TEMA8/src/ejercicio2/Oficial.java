package ejercicio2;
/**
 * Clase que representa a un oficial
 * @author Rexil
 *
 */
public class Oficial extends Empleado {
	/**
	 * Constructor sin parámetros
	 */
	public Oficial() {
		super();
	}

	
	/**
	 * Constructor con parámetros
	 * @param nombre nombre del oficial
	 */
	public Oficial(String nombre) {
		super(nombre);
	}


/**
 * Pasa los datos del oficial a String
 */
	@Override
	public String toString() {
		return "Empleado " + nombre + "-> Oficial";
	}
}
