/*Objetivo: Calcular e imprimir el incremento del sueldo y el sueldo nuevo de un
empleado dependiendo del tipo de empleado (1 = 5%, 2 = 7%, 3 = 9%, 4 = 12%, 5 = 15%)*/
import java.util.Scanner;
class Empleado{
  public static void main (String args[]){
    //declaración de variables
    String nombre = "";
    float sueldo = 0f;
    float incremento = 0f;
    float sueldoFinal = 0f;
    int tipo = 0;
    Scanner entrada = new Scanner(System.in);

    //Entrada de datos
    System.out.println("Introduzca su nombre");
    nombre = entrada.nextLine();

    System.out.println("Introduzca su sueldo actual");
    sueldo = entrada.nextFloat();

    System.out.println("Introduzca su tipo de empleado (1 a 5)");
    tipo = entrada.nextInt();

    //valoración de datos obtenidos
    if (tipo == 1) {
      incremento = (float) sueldo * 0.05f;
      sueldoFinal = sueldo + incremento;
      System.out.println(nombre + ": su incremento de sueldo es de: $"
      + incremento + " pesos. Su su nuevo sueldo es: " + sueldoFinal);
    }else if (tipo == 2) {
      incremento = (float) sueldo * 0.07f;
      sueldoFinal = sueldo + incremento;
      System.out.println(nombre + ": su incremento de sueldo es de: $"
      + incremento + " pesos. Su su nuevo sueldo es: " + sueldoFinal);
    }else if (tipo == 3) {
      incremento = (float) sueldo * 0.09f;
      sueldoFinal = sueldo + incremento;
      System.out.println(nombre + ": su incremento de sueldo es de: $"
      + incremento + " pesos. Su su nuevo sueldo es: " + sueldoFinal);
    }else if (tipo == 4) {
      incremento = (float) sueldo * 0.12f;
      sueldoFinal = sueldo + incremento;
      System.out.println(nombre + ": su incremento de sueldo es de: $"
      + incremento + " pesos. Su su nuevo sueldo es: " + sueldoFinal);
    }else if (tipo == 5) {
      incremento = (float) sueldo * 0.15f;
      sueldoFinal = sueldo + incremento;
      System.out.println(nombre + ": su incremento de sueldo es de: $"
      + incremento + " pesos. Su su nuevo sueldo es: " + sueldoFinal);
    }else {
      System.out.println("Datos incorrectos");
    }
  }
}
