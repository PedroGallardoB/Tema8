package ejercicio2;
/**
 * Clase que representa a los directivos
 * @author Rexil
 *
 */
public class Directivo extends Empleado {
/**
 * Constructor vacío
 */
	public Directivo() {
		super();
	}

	
	/**
	 * Constructor con parámetros
	 * @param nombre nombre del directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}


/**
 * Método que imprime los datos de este directivo
 */
	@Override
	public String toString() {
		return "Empleado " + nombre + "-> Directivo";
	}

}
