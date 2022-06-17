/* Objetivo del programa: Aceptar mediante el teclado una cantidad de horas, calcular y
desplegar en pantalla su equivalente en minutos, segundos y días. */

class Tiempo{
  public static void main (String args[]){
    //declaración de variables
    float horas = 0f;
    float minutos = 0f;
    float segundos = 0f;
    float dias = 0f;

    //entrada de datos
    System.out.println("Inserte la cantidad de horas");
    horas = Leer.datoFloat();

    //calculo de días, minutos y segundos
    dias = (float) horas / 24;
    minutos = (float) horas * 60;
    segundos = (float) horas * 3600;

    //salida de datos
    System.out.println( horas + " horas son: " + dias + " días, "
    + minutos + " minutos y " + segundos + " segundos.");
  }
}
