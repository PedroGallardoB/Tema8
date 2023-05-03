package ejercicio1;
/**
 * Clase que guarda la hora
 * @author Rexil
 *
 */
public class Hora {
	/**
	 * Variable que guarada las horas
	 */
	protected int hora;
	/**
	 * Variable que guarada los minutos
	 */
	protected int minutos;
/**
 * Comprueba que las horas y los minutos esten bien y construye la hora
 * @param hora
 * @param minutos
 */
	public Hora(int hora, int minutos) {
		if (hora >= 0) {
			this.hora = hora;
		}
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}
/**
 * Incrementa los minutos y la hora 
 */
	public void inc() {
		if (minutos > 60) {
			minutos++;
		} else {
			minutos = 0;
			hora++;
			if (hora >= 23) {
				hora = 0;
			}
		}
	}
/**
 * 
 * @param cantidad cantidad de minutos
 * @return Devuelve true si el valor estaba bien
 */
	protected boolean setMinutos(int cantidad) {//Comprueba que los minutos esten bien y les da valor
		boolean exito = false;
		if (cantidad >= 0 && cantidad <= 59) {
			this.minutos = cantidad;
			exito = true;
		}
		return exito;
	}
/**
 * //Comprueba que las horas esten bien y les da valor
 * @param cantidad
 * @return Devuelve true si el valor estaba bien
 */
	protected boolean setHoras(int cantidad) {
		boolean exito = false;
		if (cantidad >= 0 && cantidad <= 23) {
			this.hora = cantidad;
			exito = true;
		}
		return exito;
	}
/**
 * Da la hora como String
 */
	@Override
	public String toString() {
		String res = "";
		if (hora <= 9) {
			res += "0";
		}
		res+= hora+":";
		if (minutos <= 9) {
			res += "0";
		}
		res+=minutos;
		return res;
	}
}
