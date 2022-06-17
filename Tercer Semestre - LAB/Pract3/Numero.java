/*Objetivo: Decir el nombre un número menor o igual a 10 insertado mediante el teclado.*/

import java.util.Scanner;
class Numero{
  public static void main(String args[]){
    //declaración de variables
    int n = 0;
    Scanner sc = new Scanner(System.in);
    //Entrada de datos
    System.out.println("Teclea un número menor o igual a 10.");
    n = sc.nextInt();

    //evaluación de datos
    if (n >0 && n<=10) {
      if (n > 2) {
        if (n > 6) {
          if (n > 8) {
            if (n > 9) {
              System.out.println("Diez.");
            }else {
              System.out.println("Nueve.");
            }
          }else {
            if (n > 7) {
              System.out.println("Ocho.");
            }else {
              System.out.println("Siete.");
            }
          }
        }else {
          if (n > 4) {
            if (n > 5) {
              System.out.println("Seis.");
            }else {
              System.out.println("Cinco.");
            }
          }else {
            if (n > 3) {
              System.out.println("Cuatro.");
            }else {
              System.out.println("Tres.");
            }
          }
        }
      }else {
        if (n > 1) {
          System.out.println("Dos.");
        }else {
          System.out.println("Uno.");
        }
      }
    }else {
      System.out.println("Dato erróneo.");
    }
    System.out.println("Hasta Luego");
  }
}
