/*Objetivo: Crear un juego de ahoracado: adivinar una palabra letra por letra.*/

import java.util.Scanner;

class Ahorcado{
  public static void main(String[] args){
    //variables
    Scanner entrada = new Scanner(System.in);
    String cadena = "";
    String caracter = "";
    int cuantos = 0, vidas = 5, correctas = 0;
    boolean letra = false, condicion = false;

    //para insertar la palabra a adivinar
    System.out.println("Bienvenid@ al juego! Tienes 5 vidas");
    System.out.println("Teclea una palabra");
    cadena = entrada.nextLine();
    cuantos = cadena.length();
    char[] palabra = new char[cuantos];

    for (int i = 0; i < cuantos ; i++ ) {
      System.out.print(" _"); //inserta los _ correspondientes a cada letra
    }

    //while para la entrada "infinita" de letras
    while (condicion == false){
      System.out.println("\nTeclea un carácter");
      caracter = entrada.next();
      /*si la cadena contiene al caracter, entonces guarda el caracter
      y se despliega en pantalla*/
      if (cadena.contains(caracter)) {
        correctas++;
        for (int i = 0; i < cuantos ; i++) {
          if (caracter.charAt(0) == cadena.charAt(i)) {
            letra = true;
            palabra[i] = caracter.charAt(0);
          }
          if (correctas > 0 && letra == true) {
            System.out.print(palabra[i]);
          }
          if (palabra[i] != cadena.charAt(i)) {
            System.out.print(" _");
          }
        }
      }/*else if (cadena.contains(caracter) == false){
        /*si la cadena no tiene el caracter, quita una
        vida y pone lo que ya se tiene*/
        /*vidas--;
        for (int i = 0; i < cuantos ; i++ ) {
          if (correctas > 0 && letra == true) {
            System.out.print(palabra[i]);
          }
          if (palabra[i] != cadena.charAt(i)) {
            System.out.print(" _");
          }
        }
        System.out.println("\nIncorrecto. Intenta otra vez");
        System.out.println("\nLe quedan " + vidas + " vidas");
      }*/
      //condiciones para evaluar si se ganó el juego o se perdió
      if (correctas == cuantos) {
        condicion = true;
        System.out.println("\nFelicidades! Ganaste!");
      }
      if(vidas == 0){
        condicion = true;
       System.out.println("\nPerdiste :( La palabra era " + cadena);
      }
    }
    System.out.println("Gracias! Regrese pronto!");
  }
}
