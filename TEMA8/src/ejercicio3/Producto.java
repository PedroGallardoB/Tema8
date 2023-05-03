package ejercicio3;

public class Producto {
	/**
	 * Nombre del producto
	 */
	protected String nombre = "";
	/**
	 * Precio del producto
	 */
	protected double precio = 0;
	
	/**
	 * Constructor por defecto de Producto
	 */
	public Producto() {
	
	}

	/**
	 * Constructor de Producto que recibe el nombre y el precio
	 * @param nombre el nombre del producto
	 * @param precio el precio del producto
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		setPrecio(precio);
	}

	/**
	 * Obtiene el nombre del producto
	 * @return el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nombre al producto
	 * @param nombre el nombre que se quiere asignar
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			System.out.println("No es válido introducir una cadena vacía");
		}
	}

	/**
	 * Obtiene el precio del producto
	 * @return el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Asigna un precio al producto
	 * @param precio el precio que se quiere asignar
	 */
	public void setPrecio(double precio) {
		if(precio>=0) {
			this.precio = precio;
		}
		else {
			System.out.println("El precio no es válido");
		}
	}

	/**
	 * Calcula el precio total de una cantidad de productos
	 * @param cantidad la cantidad de productos
	 * @return el precio total
	 */
	protected double calcular(int cantidad) {
		double resultado = cantidad * precio;
		return resultado;
	}

	/**
	 * Método para pasar a String
	 */
	@Override
	public String toString() {
		return "Producto  " + nombre + ", precio " + precio + "€";
	}
}

