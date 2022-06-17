/* Objetivo del programa: Elaborar un algoritmo que lea el nombre del artículo y su costo.
 Calcular y desplegar el nombre del  artículo, utilidad (150%) y precio de venta (115%). */

class Ventas{
  public static void main (String args[]){
    //declaración de variables
    float costo = 0f;
    float utilidad = 0f;
    float p_venta = 0f;
    String nombre = "";

    //entrada de datos
    System.out.println("Inserte el nombre del producto");
    nombre = Leer.dato();

    System.out.println("Inserte el costo del producto");
    costo = Leer.datoFloat();

    //calculo de utilidad y precio de venta
    utilidad = (float) costo * 1.5f;
    p_venta = (float) costo * 1.15f;

    //salida de datos
    System.out.println("El producto " + nombre + " tiene una utilidad de "
    + utilidad + " pesos y un precio de venta de " + (p_venta) + " pesos.");
  }
}
