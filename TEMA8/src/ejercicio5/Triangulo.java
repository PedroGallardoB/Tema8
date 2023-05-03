package ejercicio5;
/**
 * Clase que representa un triángulo
 * @author Rexil
 */
public class Triangulo extends Poligono {
	/**
	 * Variable que guarda la longitud del lado
	 */
	private double lado1;
	/**
	 * Variable que guarda la longitud del lado
	 */
	private double lado2;
	/**
	 * Variable que guarda la longitud del lado
	 */
	private double lado3;
/**
 * @param lado1 longitud del lado
 * @param lado2 longitud del lado
 * @param lado3 longitud del lado
 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if(lado1>0)
		this.lado1 = lado1;
		if(lado2>0)
		this.lado2 = lado2;
		if(lado3>0)
		this.lado3 = lado3;
	}
/**
 * Getter del lado
 * @return Devuelve el valor del lado
 */
	public double getLado1() {
		return lado1;
	}
/**
 * Da valor al lado
 * @param lado1 Lado del triangulo
 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	/**
	 * Getter del lado
	 * @return Devuelve el valor del lado
	 */
	public double getLado2() {
		return lado2;
	}
	/**
	 * Da valor al lado
	 * @param lado2 Lado del triangulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	/**
	 * Getter del lado
	 * @return Devuelve el valor del lado
	 */
	public double getLado3() {
		return lado3;
	}
	/**
	 * Da valor al lado
	 * @param lado3 Lado del triangulo
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
/**
 * Calcula el area
 * @return devuelve el area del triangulo
 */
	@Override
	public double area() {
		double semiperimetro = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
	}
/**
 * Pasa los parámetros como String
 * @return Devuelve los valores del triangulo como String
 */
	@Override
	public String toString() {
		return "Triangulo de lados: " + lado1 + ", " + lado2 + ", " + lado3;
	}
}
