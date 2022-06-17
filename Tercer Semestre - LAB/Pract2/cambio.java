/* Objetivo del programa: Calcular y desplegar la cantidad de pesos dada una cantidad de dolares */

class Cambio{

  //declaración de constante de cambio pesos-dolar
  static final float CAMBIO = 21.33f;

  public static void main (String args[]){
    //declaración de variables
    float dolar = 0f;
    float pesos = 0f;

    //entrada de datos
    System.out.println("Inserte la cantidad de dólares");
    dolar = Leer.datoFloat();

    //calculo de equivalente en pesos
    pesos = (float) dolar * CAMBIO;

    //salida de datos
    System.out.println("La cantidad de " + dolar + " dolares en pesos es: " + pesos + " pesos.");
  }
}
