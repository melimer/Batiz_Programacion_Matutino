/*Objetivo: Verificar si una cadena insertada en el teclado es un palíndromo.*/

import java.util.Scanner;
class Palin{
  public static void main(String[] args){
    //variables
    String cadena = "", cadena2 = "";
    Scanner entrada = new Scanner(System.in);
    int cuantos = 0;

    System.out.println("Teclea una cadena de caracteres");
    cadena = entrada.nextLine();
    cuantos = cadena.length();

    for (int i = 0; i < cuantos ; i++ ) {
      cadena2 = cadena.charAt(i) + cadena2;
    }
    if (cadena.equals(cadena2)) {
      System.out.println("La cadena " + cadena + " es un palíndromo\n" + cadena2);
    }else {
      System.out.println("La cadena " + cadena + " no es un palíndromo\n" + cadena2);
    }
  }
}
