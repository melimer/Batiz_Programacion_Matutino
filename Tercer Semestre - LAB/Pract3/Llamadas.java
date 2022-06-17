/*Objetivo: Calcular el costo de una llamada telefónica,
local ($0.70 >= 5 mins, o $0.80), nacional ($1.50 >= 5 mins, o $1.20) o
internacional ($2.00 >= 5 mins, o $1.80). Desplegar el resultado.*/

import java.util.Scanner;
class Llamadas{
  public static void main(String args[])
  {
    //declaración de variables
    Scanner entrada = new Scanner (System.in);
    char opcion;
    float duracion = 0f;
    float costo = 0f;
    //Entrada de datos
    System.out.println("TELÉFONOS DE MÉXICO");
    System.out.println("A - LOCAL");
    System.out.println("B - NACIONAL");
    System.out.println("C - INTERNACIONAL");
    System.out.println("TECLEA LA OPCIÓN DESEADA");
    opcion =  entrada.next().charAt(0);
    //evaluación de datos
    if (opcion == 'A' || opcion == 'B' || opcion == 'C') {
      System.out.println("Teclea la duración (minutos)");
      duracion = entrada.nextFloat();
      if (opcion == 'A' && duracion <= 5) {
        costo = (float) duracion * 0.70f;
        System.out.println("El costo de la llamada es: " + costo + " pesos.");
      }else if (opcion == 'B' && duracion <= 5) {
        costo = (float) duracion * 1.50f;
        System.out.println("El costo de la llamada es: " + costo + " pesos.");
      }else if (opcion == 'C' && duracion <= 5){
        costo = (float) duracion * 2.00f;
        System.out.println("El costo de la llamada es: " + costo + " pesos.");
      }else if (opcion == 'A') {
        costo = (float) duracion * 0.80f;
        System.out.println("El costo de la llamada es: " + costo + " pesos.");
      }else if (opcion == 'B') {
        costo = (float) duracion * 1.20f;
        System.out.println("El costo de la llamada es: " + costo + " pesos.");
      }else{
        costo = (float) duracion * 1.80f;
        System.out.println("El costo de la llamada es: " + costo + " pesos.");
      }
    }else {
      System.out.println("Opción incorrecta");
    }
  }
}
