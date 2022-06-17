/*Objetivo: desplegar la tabla de multiplicar de un número dado mediante el teclado.*/

class Multiplicar{
  public static void main(String[] args){
    //variables
    int numero = 0;

    //entrada de datos
    System.out.println("Teclea el número que deseas multiplicar");
    numero = Leer.datoInt();

    //for
    for (int i = 1; i <= 10 ; i++ ) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
}
