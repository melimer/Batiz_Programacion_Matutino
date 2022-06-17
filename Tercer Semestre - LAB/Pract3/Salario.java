/*Objetivo: Calcular lo que se le tiene que pagar a un empleado.
Datos de entrada: nombre, salario mensual y falta que tuvo durante el año.
Todos los datos son introducidos mediante el teclado.*/

import java.util.Scanner;
class Salario{
  public static void main (String args[]){
    //declaración de variables
    String nombre = "";
    float salario = 0f;
    int faltas = 0;
    float compensacion = 0f;
    float totalPagar = 0f;
    Scanner entrada = new Scanner(System.in);

    //Entrada de datos
    System.out.println("Introduzca su nombre");
    nombre = entrada.nextLine();

    System.out.println("Introduzca su salario mensual");
    salario = entrada.nextFloat();

    System.out.println("Introduzca la cantidad de faltas que tuvo durante el año");
    faltas = entrada.nextInt();

    //valoración de datos obtenidos
    if (faltas == 0) {
      compensacion = salario;
    }else if (faltas == 1) {
      compensacion = (float) salario * 0.9f;
    }else if (faltas == 2 || faltas == 3) {
      compensacion = (float) salario * 0.8f;
    }else {
      compensacion = 0;
    }
    //salida de datos
    if (faltas > 3) {
      System.out.println(nombre + ": No tiene derecho a compensacion." +
      "El monto a cobrar es: " + (salario));
    }else {
      System.out.println(nombre + ": La compensación es de: $" + compensacion +
      "pesos. El monto a cobrar es : " + (salario + compensacion));
    }
  }
}
