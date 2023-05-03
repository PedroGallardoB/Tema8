package ejercicio5;

/**
 * Clase padre para los poligonos
 * 
 * @author Rexil
 *
 */
public abstract class Poligono {
	/**
	 * Parametro que guarda el numero de lados del polígono
	 */
	protected int numeroLados;

	/**
	 * Constructor que usa el número de lados
	 * 
	 * @param numeroLados
	 */
	public Poligono(int numeroLados) {
		if (numeroLados < 0)
			this.numeroLados = numeroLados;
	}

	/**
	 * Getter del número de lados
	 * 
	 * @return Devuelve el número de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método abstracto que calcula el area
	 * 
	 * @return Devuelve el área
	 */
	public abstract double area();

	/**
	 * Convierte el poligono a string con sus datos
	 */
	@Override
	public String toString() {
		return "Poligono de " + numeroLados + " lados";
	}
}