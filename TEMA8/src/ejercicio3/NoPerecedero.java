package ejercicio3;

/**
La clase NoPerecedero representa un producto no perecedero que hereda de la clase Producto.
*/
public class NoPerecedero extends Producto {

/**
El tipo de producto no perecedero.
*/
String tipo = "";
/**
Constructor de la clase NoPerecedero.
@param nombre El nombre del producto.
@param precio El precio del producto.
@param tipo El tipo de producto no perecedero.
*/
public NoPerecedero(String nombre, double precio, String tipo) {
this.nombre = nombre;
this.precio = precio;
this.tipo = tipo;
}
/**
Devuelve una cadena de texto que representa el objeto.
@return La representación en cadena del objeto.
*/
@Override
public String toString() {
return super.toString();
}
}






