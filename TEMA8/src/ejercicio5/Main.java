package ejercicio5;

import java.util.Scanner;

public class Main {

	//Método principal del programa
	public static void main(String[] args) {
		//Creamos un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		//Creamos un array de polígonos de tamaño máximo 100
		Poligono[] poligonos = new Poligono[100];
		//Inicializamos la opción del menú a 0
		int opcion = 0;
		//Inicializamos el número de polígonos a 0
		int numPoligonos = 0;
		//Variables para almacenar los datos del triángulo o rectángulo
		double lado1;
		double lado2;
		double lado3;
		double altura;
		double base;
		
		//Creamos un bucle que se ejecutará hasta que se elija la opción de salir (4)
		while (opcion != 4) {
			//Mostramos el menú
			System.out.println("MENÚ");
			System.out.println("1. Introducir triángulo");
			System.out.println("2. Introducir rectángulo");
			System.out.println("3. Mostrar contenido del array");
			System.out.println("4. Salir");
			System.out.print("Introduce una opción: ");
			//Leemos la opción elegida por el usuario
			opcion = sc.nextInt();

			//Realizamos una acción en función de la opción elegida
			switch (opcion) {
			case 1:
				//Introducimos triángulo
				System.out.println("Introduce el lado 1:");
				//Leemos el lado 1
				 lado1 = sc.nextDouble();
				 System.out.println("Introduce el lado 2:");
				 //Leemos el lado 2
				 lado2 = sc.nextDouble();
				 System.out.println("Introduce el lado 3:");
				 //Leemos el lado 3
				 lado3 = sc.nextDouble();
				 //Creamos un nuevo objeto Triangulo con los lados introducidos
				poligonos[numPoligonos] = new Triangulo(lado1, lado2, lado3);
				//Aumentamos el número de polígonos
				numPoligonos++;
				break;
			case 2:
				// Introducimos rectángulo
				System.out.println("Introduce la base:");
				//Leemos la base
				base = sc.nextDouble();
				System.out.println("Introduce la altura:");
				//Leemos la altura
				altura = sc.nextDouble();
				//Creamos un nuevo objeto Rectangulo con la base y altura introducidas
				poligonos[numPoligonos] = new Rectangulo(base, altura);
				//Aumentamos el número de polígonos
				numPoligonos++;
				break;
			case 3:
				// Mostramos el contenido del array
				System.out.println("Contenido del array:");
				//Recorremos el array y mostramos la información de cada polígono
				for (int i = 0; i < numPoligonos; i++) {
					System.out.println(poligonos[i].toString());
					System.out.println("Área: " + poligonos[i].area());
				}
				break;
			case 4:
				// Salimos del programa
				System.out.println("Fin del programa");
				break;
			default://Mostramos si una opción no era válida
				System.out.println("Opción no válida");
				break;
			}
		}

		sc.close();
	}

}
