package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleccion = 0; //Variable que guarda la eleccion de producto
        int cantidad = 0; //Variable que guarda la cantidad del producto
        boolean datosCorrectos = false; //Boolean que indica si los datos ingresados son correctos
        Producto productos[] = {//Lista de productos 
            new Producto("Lavadora", 10),
            new Perecedero("Plátano", 2, 1),
            new NoPerecedero("PC", 2300, "Informática"),
            new NoPerecedero("Reproductor DVD", 30, "Multimedia"),
            new Perecedero("Lentejas", 5, 2)
        };
        Scanner sc = new Scanner(System.in);
        //While que se repetirá hasta que se ingresen datos correctos
        while (!datosCorrectos) {
            System.out.println("PRODUCTOS: ");
            //For que muestra los productos disponibles
            for (int i = 0; i < productos.length; i++) {
                System.out.println(i + ") " + productos[i]);
            }
            System.out.println("Diga el numero del producto del que quiere saber el precio");
            eleccion = sc.nextInt();
            //Validación de la elección del producto
            if (eleccion > productos.length || eleccion < 0){
                System.out.println("POSICIÓN INCORRECTA");
                continue; //Vuelve al inicio del while
            }
            System.out.println("Diga la cantidad de productos del que quiere saber el precio");
            cantidad = sc.nextInt();
            //Validación de la cantidad de productos
            if (cantidad < 0){
                System.out.println("CANTIDAD INCORRECTA");
                continue; //Vuelve al inicio del while
            }
            datosCorrectos = true; //Si se han ingresado datos correctos, devuelve true
        }
        System.out.println("El precio es " + productos[eleccion].calcular(cantidad));
        sc.close(); //Cierre del Scanner
    }
}
