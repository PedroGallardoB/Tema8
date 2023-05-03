package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	HoraExacta horaesc = new HoraExacta(0,0,0);//Hora por defecto
	Scanner sc = new Scanner(System.in);
	//Pedimos y damos datos a la hora
	System.out.println("Introduzca los segundos");
	horaesc.setSegundos(sc.nextInt());
	System.out.println();
	System.out.println("Introduzca los minutos");
	horaesc.setMinutos(sc.nextInt());
	System.out.println();
	System.out.println("Introduzca los horas");
	horaesc.setHoras(sc.nextInt());
	//Incrementamos un segundo la hora y la imprimimos
	System.out.println("Incrementamos un segundo");
	horaesc.inc();
	System.out.println("Imprimimos la hora");
	System.out.println(horaesc.toString());
	sc.close();
	}
}
