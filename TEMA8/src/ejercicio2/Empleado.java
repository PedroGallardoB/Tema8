package ejercicio2;
/**
 * Clase que representa a los directivos
 * @author Rexil
 *
 */
public class Empleado {
/**
 * nombre del empleado
 */
	protected String nombre = "";
/**
 * Constructor con parámetros
 * @param nombre nombre del empleado
 */
	public Empleado(String nombre) {
		if(nombre!=null&&nombre.length()>0)
		this.nombre = nombre;
	}
	/**
	 * Constructor vacío
	 */
	public Empleado() {
	}
/**
 * Consigue el valor de nombre
 * @return Devuelve el valor de nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
 * Si el nombre es válido le asigna ese valor
 * @param nombre
 */
	public void setNombre(String nombre) {
		if(nombre!=null&&nombre.length()>0)
		this.nombre = nombre;
	}
/**
 * Pasa a string los datos del empleado
 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
}
