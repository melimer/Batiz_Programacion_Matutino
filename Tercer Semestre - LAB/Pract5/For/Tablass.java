/*Objetivo: Desplegar una tabla como se muestra en el documento de word.*/

class Tablass{
  public static void main(String[] args){
    //variables
    int suma = 0;
    //for
    for (int i = 1; i <= 50; i++ ) {
      System.out.print(i + "\t");
      suma = suma + i;
      if (i % 10 == 0) {
        System.out.print(suma + "\n");
        suma = 0;
      }
    }
  }
}
