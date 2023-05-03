package ejercicio5;
/**
 * Clase que representa un rectángulo
 * @author Rexil
 *
 */
public class Rectangulo extends Poligono {
	/**
	 * Variable que guarda la longitud de la base
	 */
	private double base;
	/**
	 * Variable que guarda la longitud de la altura
	 */
	private double altura;

	/**
	 * Constructor por defecto
	 */
	public Rectangulo() {
		super(4);
		this.base = 0;
		this.altura = 0;
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param base   Parametro que guarda la longitud de la altura
	 * @param altura Parametro que guarda la longitud de la base
	 */
	public Rectangulo(double base, double altura) {
		super(4);
		if(base>0)
		this.base = base;
		if(altura>0)
		this.altura = altura;
	}

	/**
	 * Consigue el valor de la longitud de la base
	 * 
	 * @return devuelve el valor de la longitud de la base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Da valor a la longitud de la base
	 */
	public void setBase(double base) {
		if(base>0)
		this.base = base;
	}
/**
 * Consigue el valor de la altura
 * @return devuelve el valor de la altura
 */
	public double getAltura() {
		return altura;
	}
	/**
	 * Da valor a altura
	 */
	public void setAltura(double altura) {
		if(altura>0)
		this.altura = altura;
	}
/**
 * Calcula el area
 * @return Devuelve el área
 */
	@Override
	public double area() {
		return base * altura;
	}
	/**
	 * Pasa los datos a string
	 * @return Devuelve los datos en String
	 */
	@Override
	public String toString() {
		return "Rectángulo: Base " + base + ", Altura " + altura + ", Número de lados " + numeroLados;
	}
}
