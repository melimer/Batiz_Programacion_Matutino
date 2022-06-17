/*Objetivo: De una cadena dada por el teclado,
poner cada la cantidad de vocales, consonantes, etc,
que lo componen en una linea nueva*/

import java.util.Scanner;
class Cadenas2{
  public static void main(String[] args){
    //obtener cuantas vocales, consonantes, etc hay
    int vocales = 0, consonantes = 0, numeros = 0, espacios = 0, especiales = 0;
    int cuantos = 0;
    String cadena = "";
    Scanner entrada = new Scanner(System.in);

    System.out.println("Teclea una cadena de caracteres");
    cadena = entrada.nextLine();
    cuantos = cadena.length();

    for (int i = 0; i < cuantos ; i++ ) {
      if (cadena.charAt(i) == ' ') {
        ++ espacios;
      }else if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'
      || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
      || cadena.charAt(i) == 'u' ) {
        ++vocales;
      }else if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
        ++consonantes;
      }else if (cadena.charAt(i) >= '0' && cadena.charAt(i) <= '9') {
        ++numeros;
      }else{
        ++especiales;
      }
    }

    System.out.println("espacios: " + espacios);
    System.out.println("vocales: " + vocales);
    System.out.println("consonantes: " + consonantes);
    System.out.println("numeros: " + numeros);
    System.out.println("carcáteres especiales: " + especiales);
  }
}
