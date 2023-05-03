package ejercicio3;

public class Perecedero extends Producto {

    int diasACaducar = 0;

    /**
     * Constructor para objetos de la clase Perecedero.
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     * @param diasACaducar Los días que quedan para que caduque el producto.
     */
    public Perecedero(String nombre, int precio, int diasACaducar) {
        super(nombre, precio);
        if(diasACaducar > 0) {
            this.diasACaducar = diasACaducar;
        } else {
            System.out.println("Cantidad de días no válida");
        }
    }

    /**
     * Devuelve una cadena que representa el objeto actual.
     * @return Cadena que representa el objeto actual.
     */
    @Override
    public String toString() {
        return super.toString() + " días a caducar: " + diasACaducar;
    }

    /**
     * Calcula el precio final del producto.
     * @param cantidad La cantidad de producto que se quiere calcular.
     * @return El precio final del producto.
     */
    public double calcular(int cantidad) {

        double resultado;

        switch (diasACaducar) {
            case 1 -> {
                resultado = super.calcular(cantidad) / 4;
            }
            case 2 -> {
                resultado = super.calcular(cantidad) / 3;
            }
            case 3 -> {
                resultado = super.calcular(cantidad) / 2;
            }
            default -> {
                resultado = super.calcular(cantidad);
            }
        }

        return resultado;
    }
}
