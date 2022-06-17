/*Objetivo: Decir el nombre un número menor o igual a 10 insertado mediante el teclado.*/

import java.util.Scanner;
class Problemas{
  public static void main(String args[]){
    //declaración de variables
    int n = 0;
    Scanner sc = new Scanner(System.in);
    //Entrada de datos
    System.out.println("Teclea un número menor o igual a 10.");
    n = sc.nextInt();
    //evaluación de datos
    if (n >0 && n<=10) {
      if (n > 5) {
        if (n > 7) {
          if (n > 9) {
            System.out.println("Diez");
          }else {
            if (n > 8) {
              System.out.println("Nueve");
            }else {
              System.out.println("Ocho");
            }
          }
        }else {
          if (n > 6) {
            System.out.println("Siete");
          }else {
            System.out.println("Seis");
          }
        }
      }else {
        if (n > 3) {
          if (n > 4) {
            System.out.println("Cinco");
          }else {
            System.out.println("Cuatro");
          }
        }else {
          if (n > 1) {
            if (n > 2) {
              System.out.println("Tres");
            }else {
              System.out.println("Dos");
            }
          }else {
            System.out.println("Uno");
          }
        }
      }
    }else {
      System.out.println("Dato erróneo.");
    }
    System.out.println("Hasta Luego");
  }
}
