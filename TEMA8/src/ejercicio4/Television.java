package ejercicio4;

public class Television extends Electrodomestico {
	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
/**
 * Constructor sin parámetros
 */
	public Television() {
		super();
	}
/**
 * Constructor con dos parámetros 
 * @param precioBase Precio base de la TV
 * @param peso Peso de la TV
 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}
/**
 * Constructor con todos los parámetros de la lavadora
 * @param precioBase Precio base de la TV
 * @param peso Peso de la TV
 * @param color Color de la TV
 * @param consumo Consumo de la TV
 * @param resolucion Resolución de la TV
 * @param sintonizadorTDT Guarda si tiene TDT
 */
	public Television(double precioBase, double peso, String color, char consumo, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumo);
		if (resolucion>0)
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
/**
 * Getter de la resolución
 * @return Devuelve la resolución
 */
	public int getResolucion() {
		return resolucion;
	}
/**
 * Setter de la resolución
 * @param resolucion Da valor a la resolución
 */
	public void setResolucion(int resolucion) {
		if (resolucion > 0)
			this.resolucion = resolucion;
		else {
			System.out.println("Por favor, la resolución debe ser mayor que 0");
		}
	}

	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
/**
 * Método que da valor al precio final
 * @return precio Precio final
 */
@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		if (resolucion > 40) {
			precio += precio * 0.3;
		}
		if (sintonizadorTDT) {
			precio += 50;
		}
		return precio;
	}
}