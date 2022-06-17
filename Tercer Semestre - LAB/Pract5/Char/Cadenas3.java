/*Objetivo: De una cadena dada por el teclado,porner la cadena al revés.*/

import java.util.Scanner;
class Cadenas3{
  public static void main(String[] args){
    //variable
    Scanner entrada = new Scanner(System.in);
    int cuantos = 0;
    String cadena = "", cadena2 = "";

    System.out.println("Teclea una cadena de caracteres");
    cadena = entrada.nextLine();
    cuantos = cadena.length();
    for (int i = 0; i < cuantos ; i++ ) {
      cadena2 = cadena.charAt(i) + cadena2;
      //a la cadena2, le suma primero el caracter y luego el resto de la cadena2
    }
    System.out.println("cadena " + cadena);
    System.out.println("cadena2 " + cadena2);
  }
}
