package ejercicio4;

public class Main {
	public static void main(String[] args) {
		// Array de electrodomesticos
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		// Precios por defecto
		double precioElectrodomesticos = 0;
		double precioLavadoras = 0;
		double precioTelevisores = 0;
		// Declaracion de los electrodomesticos
		electrodomesticos[0] = new Electrodomestico(200, 20, "blanco", 'F');
		electrodomesticos[1] = new Lavadora(400, 30, "gris", 'D', 10);
		electrodomesticos[2] = new Television(600, 15, "negro", 'B', 42, true);
		electrodomesticos[3] = new Electrodomestico(150, 10, "rojo", 'E');
		electrodomesticos[4] = new Lavadora(350, 25, "blAnco", 'C', 8);
		electrodomesticos[5] = new Television(800, 20, "azul", 'A', 55, false);
		electrodomesticos[6] = new Electrodomestico(300, 5, "azul", 'D');
		electrodomesticos[7] = new Lavadora(450, 35, "blanco", 'B', 12);
		electrodomesticos[8] = new Television(700, 30, "negro", 'C', 32, true);
		electrodomesticos[9] = new Electrodomestico(250, 15, "ROJO", 'F');
//Recorre la lista imprimiendo los productos
		for (int i = 0; i < electrodomesticos.length; i++) {
			System.out.println("Precio final: " + electrodomesticos[i].precioFinal() + ", Precio base "
					+ electrodomesticos[i].getPrecioBase());
		}
//Suma los precios de los productos de las distintas categorías
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				precioElectrodomesticos += electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				precioLavadoras += electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Television) {
				precioTelevisores += electrodomesticos[i].precioFinal();
			}
		}
//Muestra los precios totales de cada categoría
		System.out.println("El precio final de los electrodomésticos es: " + precioElectrodomesticos);
		System.out.println("El precio final de las lavadoras es: " + precioLavadoras);
		System.out.println("El precio final de los televisores es: " + precioTelevisores);
	}
}