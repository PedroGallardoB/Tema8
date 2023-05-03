package ejercicio2;

public class Main {

	public static void main(String[] args) {
		//Declaramos los objetos de los distintos puestos 
		Empleado E1 = new Empleado("Juan");
		Tecnico T1 = new Tecnico("Pedro");
		Operario O1 = new Operario ("Pablo");
		Directivo D1 = new Directivo ("Alberto");
		Oficial OF1 = new Oficial("Mario");
		//Probamos los métodos toString
		System.out.println(E1);
		System.out.println(T1);
		System.out.println(O1);
		System.out.println(D1);
		System.out.println(OF1);

	}

}
