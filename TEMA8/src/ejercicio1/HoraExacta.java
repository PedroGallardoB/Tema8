package ejercicio1;
/**
 * Clase que da la hora con segundos
 * @author Rexil
 *
 */
public class HoraExacta extends Hora {
	/**
	 * Variable que almacena los segundos
	 */
	private int segundos;
/**
 * Usa el constructor padre para dar valores y añade los segundos
 * @param hora hora 
 * @param minutos minutos 
 * @param segundos segundos
 */
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}
/**
 * 
 * @param cantidad
 * @return Devuelve true si se han podido cambiar los segundos
 */
	public boolean setSegundos(int cantidad) {
		boolean exito = false;
		if (cantidad >= 0 && cantidad <= 59) {
			this.segundos = cantidad;
			exito = true;
		}
		return exito;
	}
	
	/**
	 * Incrementa la hora un segundo
	 */
	@Override
	public void inc() {

		segundos++;
		if (segundos == 60) {
			segundos = 0;
			super.inc();
		}
	}
/**
 * Pasa la hora a string
 */
	@Override
	public String toString() {
		String res = "";
		res += super.toString() + ":";
		if (segundos <= 9) {
			res += "0";
		}
		res += segundos;
		return res;
	}
}
