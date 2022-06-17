/*Objetivo: Desplegar una tabla como se muestra en el documento de word.*/

class Tablitas{
  public static void main(String[] args){
    //variables
    int suma = 0;
    int total = 0;
    //for
    for (int i = 1; i <= 5; i++ ) {
      for (int j = 1; j <=10 ; j++ ) {
        suma = suma + 1;
        System.out.print(suma + "\t");
        total = total + suma;
      }
      System.out.print(total + "\n");
      total = 0;
    }
  }
}
