/*Objetivo: Decir el nombre un número menor o igual a 15 insertado mediante el teclado.*/

import java.util.Scanner;
class Numeros{
  public static void main(String args[]){
    //declaración de variables
    int n = 0;
    Scanner sc = new Scanner(System.in);
    //Entrada de datos
    System.out.println("Teclea un número menor o igual a 15.");
    n = sc.nextInt();

    //evaluación de datos
    if (n >0 && n<=15) {
      if (n > 8) {
        if (n > 12) {
          if (n > 14) {
            System.out.println("quince");
          }else{
            if (n > 13) {
              System.out.println("catorce");
            }else{
              System.out.println("trece");
            }
          }
        }else {
          if (n > 11) {
            System.out.println("doce");
          }else {
            if (n > 10) {
              System.out.println("once");
            }else {
              if (n > 9) {
                System.out.println("diez");
              }else {
                System.out.println("nueve");
              }
            }
          }
        }
      }else {
        if (n > 6) {
          if (n > 7) {
            System.out.println("ocho");
          }else {
            System.out.println("siete");
          }
        }else {
          if (n > 2) {
            if (n > 4) {
              if (n > 5) {
                System.out.println("seis");
              }else {
                System.out.println("cinco");
              }
            }else {
              if (n > 3) {
                System.out.println("cuatro");
              }else {
                System.out.println("tres");
              }
            }
          }else {
            if (n > 1) {
              System.out.println("dos");
            }else {
              System.out.println("uno");
            }
          }
        }
      }
    }else {
      System.out.println("Dato erróneo");
    }
    System.out.println("Hasta Luego");
  }
}
