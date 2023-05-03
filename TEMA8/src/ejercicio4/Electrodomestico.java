package ejercicio4;

/**
 * La clase Electrodomestico representa un electrodoméstico genérico
 */
public class Electrodomestico {

	/**
	 * El precio base del electrodoméstico
	 **/
	protected double precioBase = 100;

	/**
	 * El peso del electrodoméstico
	 **/
	protected double peso = 5;

	/**
	 * Los colores disponibles para el electrodoméstico
	 **/
	protected enum Color {
		blanco, negro, rojo, azul, gris
	};

	/**
	 * Los niveles de consumo energético disponibles para el electrodoméstico
	 **/
	protected enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * El color del electrodoméstico, por defecto blanco
	 */
	Color color = Color.blanco;

	/**
	 * El nivel de consumo energético del electrodoméstico, por defecto F
	 */
	ConsumoEnergetico consumo = ConsumoEnergetico.F;

	/**
	 * Constructor con precio base, peso, color y nivel de consumo energético dados
	 * 
	 * @param precioBase Precio base del electrodoméstico.
	 * @param peso       Peso del electrodoméstico.
	 * @param color      Color del electrodoméstico
	 * @param consumo    Nivel de consumo energético
	 */
	public Electrodomestico(double precioBase, double peso, String color, char consumo) {
		if (precioBase >= 0)
			this.precioBase = precioBase;
		if (peso >= 0)
			this.peso = peso;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(consumo);
	}

	/**
	 * Constructor vacío.
	 */
	public Electrodomestico() {
	};

	/**
	 * Constructor con precio base y peso como parámetros
	 * 
	 * @param precio El precio base del electrodoméstico.
	 * @param peso   El peso del electrodoméstico.
	 */
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	};

	/**
	 * Obtiene el precio base del electrodoméstico.
	 * 
	 * @return El precio base del electrodoméstico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Establece el precio base del electrodoméstico.
	 * 
	 * @param precioBase El nuevo precio base del electrodoméstico.
	 */
	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		} else {
			System.out.println("El precio no es válido");
		}
	}

	/**
	 * Obtiene el peso del electrodoméstico.
	 * 
	 * @return El peso del electrodoméstico.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Establece el peso
	 * 
	 * @param peso Peso del electrodoméstico
	 */
	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("El peso no es válido");
		}
	}

	/**
	 * Devuelve el color del electrodoméstico.
	 * 
	 * @return El color del electrodoméstico.
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Establece el color del electrodoméstico. Si el valor introducido no es
	 * válido, será blanco.
	 * 
	 * @param colorStr El color del electrodoméstico en formato String.
	 */
	public void setColor(String colorStr) {
		if (colorStr != null && colorStr.length() > 0) {
			comprobarColor(colorStr);
		} else {
			System.out.println("Debes introducir un valor para el color");
		}
	}

	/**
	 * Devuelve el consumo energético del electrodoméstico.
	 * 
	 * @return El consumo energético del electrodoméstico.
	 */
	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	/**
	 * Establece el consumo energético del electrodoméstico. Si el valor introducido
	 * no es válido, será F.
	 * 
	 * @param consumo El consumo energético del electrodoméstico en formato char.
	 */
	public void setConsumo(char consumo) {
		comprobarConsumoEnergetico(consumo);
	}

	/**
	 * Comprueba que el consumo energético introducido es válido.
	 * 
	 * @param consumoChar El consumo energético del electrodoméstico.
	 * @return devuelve el enum
	 */
	private ConsumoEnergetico comprobarConsumoEnergetico(char consumoChar) {
		String consumo = String.valueOf(consumoChar);
		String consumoElegido = "";
		switch (consumo.toUpperCase()) {
		case "A", "B", "C", "D", "E", "F" -> {
			consumoElegido = consumo;
		}
		default -> {
			System.out.println("Consumo energético no válido.");
			consumoElegido = "F";
		}
		}
		return ConsumoEnergetico.valueOf(consumoElegido);
	}

	/**
	 * Comprueba que el color introducido es válido.
	 * 
	 * @param color El color del electrodoméstico en formato String.
	 * @return El color del electrodoméstico en formato Color.
	 */
	private Color comprobarColor(String color) {
		String colorElegido = "";
		switch (color.toLowerCase()) {
		case "blanco", "negro", "rojo", "azul", "gris" -> {
			colorElegido = color.toLowerCase();
		}

		default -> {
			System.out.println("Color no válido.");
			colorElegido = "blanco";
		}
		}
		return Color.valueOf(colorElegido);
	}

	/**
	 * Calcula el precio final del electrodoméstico
	 * 
	 * @return El precio final del electrodoméstico.
	 */
	protected double precioFinal() {
		double precio = precioBase;
		switch (consumo) {// Aplicamos el precio extra por consumo
		case A -> {
			precio += 100;
		}
		case B -> {
			precio += 80;
		}
		case C -> {
			precio += 60;
		}
		case D -> {
			precio += 50;
		}
		case E -> {
			precio += 30;
		}
		case F -> {
			precio += 10;
		}

		}

		if (peso < 20 && peso > 0) {
			precio += 10;
		} else if (peso <= 20 && peso < 50) {
			precio += 50;
		} else if (peso <= 50 && peso < 80) {
			precio += 50;
		} else {
			precio += 100;
		}
		return precio;
	}
}
