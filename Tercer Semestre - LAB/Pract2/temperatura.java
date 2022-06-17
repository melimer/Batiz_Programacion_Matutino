/* Objetivo del programa: Calcular la temperatura el grados fahrenheit a una cantidad introducida
en el teclado de grados centígrados */

class Temperatura{
  public static void main (String args[]){
    float centigrados = 0f;
    float fahrenheit = 0f;

    //entrada de datos
    System.out.println("Inserte la temperatura en grados centígrados");
    centigrados = Leer.datoFloat();

    //calculo de grados fahrenheit
    fahrenheit = (((9 * centigrados) / 5) + 32);

    //salida de datos
    System.out.println("La temperatura es: " + fahrenheit + "º");
  }
}
