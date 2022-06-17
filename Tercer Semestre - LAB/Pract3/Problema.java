/*Objetivo: Calcular el costo de una llamada telefónica,
local ($0.40 por minuto), nacional ($0.80 por minuto) o
internacional ($1.20 por minuto). Desplegar el resultado.*/

import java.util.Scanner;

class Problema{

  public static void main(String args[])
  {
    //declaración de variables
    Scanner entrada = new Scanner (System.in);
    int opcion = 0;
    float duracion = 0f;
    float costo = 0f;

    //Entrada y evaluación de datos
    System.out.println("Escoja el tipo de llamada:");
    System.out.println("1 - Local");
    System.out.println("2 - Nacional");
    System.out.println("3 - internacional");
    opcion =  entrada.nextInt();

    if (opcion == 1 || opcion == 2 || opcion == 3) {
      System.out.println("Teclea la duración");
      duracion = entrada.nextFloat();
      if (opcion == 1) {
        costo = (float) duracion * 0.4f;
      }else if (opcion == 2) {
        costo = (float) duracion * 0.8f;
      }else{
        costo = (float) duracion * 1.2f;
      }
    }else {
      System.out.println("Opción incorrecta");
    }

    //salida de datos
    System.out.println("El costo de la llamada es: " + costo);
  }
}
