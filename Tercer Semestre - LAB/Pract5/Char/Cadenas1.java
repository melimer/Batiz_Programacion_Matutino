/*Objetivo: De una cadena dada por el teclado,
poner cuantos caracteres son a, e, i o u.*/

import java.util.Scanner;
class Cadenas1{
  public static void main(String[] args){
    //variables
    Scanner entrada = new Scanner(System.in);
    int cuantos = 0, aa = 0, ee = 0, ii = 0, oo = 0, uu = 0;
    String cadena = "";
    System.out.println("teclea la cadena");
    cadena = entrada.next();
    cuantos = cadena.length();
    for (int i = 0; i < cuantos ; i++ ) {
      if (cadena.charAt(i) == 'a') {
        aa++; //hay una a
      }else if (cadena.charAt(i) == 'e') {
        ee++; //hay una e
      }else if (cadena.charAt(i) == 'i') {
        ii++; //hay una i
      }else if (cadena.charAt(i) == 'o') {
        oo++; //hay una o
      }else if (cadena.charAt(i) == 'u') {
        uu++; //hay una u
      }

    }
    System.out.println("a: " + aa);
    System.out.println("e: " + ee);
    System.out.println("i: " + ii);
    System.out.println("o: " + oo);
    System.out.println("u: " + uu);
  }
}


/*for (int i = 0; i< cuantos ; i++ ) {
  System.out.println(cadena.charAt(i));
}*/
