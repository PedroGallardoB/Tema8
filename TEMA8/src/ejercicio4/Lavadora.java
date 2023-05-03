package ejercicio4;

/**
 * Clase que representa una lavadora
 */
public class Lavadora extends Electrodomestico {

	private double carga = 5; // La carga por defecto es 5 kg

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase El precio base de la lavadora
	 * @param peso El peso de la lavadora
	 * @param color El color de la lavadora
	 * @param consumo El consumo energetico de la lavadora
	 * @param carga La capacidad de carga de la lavadora
	 */
	public Lavadora(double precioBase, double peso, String color, char consumo, double carga) {
		super(precioBase, peso, color, consumo);
		if(carga>=0)
		this.carga = carga;
	}

	/**
	 * Constructor con precio y peso como parametros
	 * @param precio El precio de la lavadora
	 * @param peso El peso de la lavadora
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Metodo getter para la carga de la lavadora.
	 * @return La capacidad de carga de la lavadora en kg.
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Metodo setter para la carga de la lavadora.
	 * @param carga La capacidad de carga de la lavadora en kg.
	 */
	public void setCarga(double carga) {
		if (carga > 0) {
			this.carga = carga;
		} else {
			System.out.println("Por favor, el número debe ser positivo");
		}
	}

	/**
	 * Sobrescribimos el metodo precioFinal de la clase Electrodomestico.
	 * @return El precio final de la lavadora.
	 */
	@Override
	protected double precioFinal() {
		double precio = super.precioFinal();
		if (carga > 30) {
			precio += 50;
		}
		return precio;
	}
}
