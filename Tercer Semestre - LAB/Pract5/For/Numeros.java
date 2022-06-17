/*Objetivo: Aceptar mediante el teclado 10 números, deplegar el promedio,
el número mayor y el número menor.*/

class Numeros{
  public static void main(String[] args){
    //variables
    int[] numero = new int[10];
    int total = 0;
    int mayor = 0;
    int menor = 0;
    //for y entrada de datos
    for (int i = 0; i<=9 ; i++ ) {
      System.out.println("Inserte un número");
      numero[i] = Leer.datoInt();
      total = total + numero[i];
    }
    menor = numero[9];

    for (int i = 0; i<=9 ; i++ ) {
      if (numero[i] > mayor) {
        mayor = numero[i];
      }
      if (numero[i] < menor) {
        menor = numero[i];
      }
    }
    System.out.println("El promedio es: " + ((float) total/10));
    System.out.println("El número mayor es: " + mayor);
    System.out.println("El número menor es: " + menor);
  }

}
