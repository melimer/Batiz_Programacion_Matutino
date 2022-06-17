/*Objetivo: Desplegar una palabra insertada mediante el teclado pero sin espacios.*/

import java.util.Scanner;
class Espacios{
  public static void main(String[] args){
    //variables
    String cadena = "", cadena2 = "";
    Scanner entrada = new Scanner(System.in);
    int cuantos = 0;

    System.out.println("Teclea una cadena de caracteres");
    cadena = entrada.nextLine();
    cuantos = cadena.length();

    for (int i = 0; i < cuantos ; i++ ) {
      if (cadena.charAt(i) != ' ') {
        cadena2 = cadena2 + cadena.charAt(i);
        //si el caracter no es un espacio, lo agrega a la nueva cadena
      }

    }
      System.out.println(cadena2);
  }
}
