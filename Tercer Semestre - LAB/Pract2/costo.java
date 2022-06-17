/* Objetivo del programa: Calcular el costo de un terreno rectangular
 dados los valores de la base, longitud y costo del metro cuadrado insertados por el teclado */


class Costo{
  public static void main (String args[]){
    //declaración de variables
    float base = 0f;
    float longitud = 0f;
    float costoMC = 0f;
    float costoTerreno = 0f;

    //entrada de datos
    System.out.println("Inserte la base");
    base = Leer.datoFloat();

    System.out.println("Inserte la longitud");
    longitud = Leer.datoFloat();

    System.out.println("Inserte el costo de metro cuadrado");
    costoMC = Leer.datoFloat();

    //calculo del costo del terreno
    costoTerreno = (float) base * longitud * costoMC;

    //salida de datos
    System.out.println("El costo del terreno es: " + costoTerreno);
  }
}
