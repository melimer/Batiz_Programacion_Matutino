/*Objetivo: Desplegar una tabla como se muestra en el documento de word.*/

class Tablita{
  public static void main(String[] args){
    //variables
    int suma = 0;
    int sumaTotal = 0;
    int total = 0;
    //for
    for (int i = 1; i <= 5; i++ ) {
      for (int j = 1; j <= 5 ; j++ ) {
        suma = suma + 10;
        System.out.print(suma + "\t");
        sumaTotal = sumaTotal + suma;
      }
      System.out.print(sumaTotal + "\n");
      total = total + sumaTotal;
      sumaTotal = 0;
    }
    System.out.println("Gran total: " + total);
  }
}
