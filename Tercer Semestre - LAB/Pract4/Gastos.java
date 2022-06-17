/*Objetivo: Calcular el total de gastos de una persona,
los gastos son introducidos mediante el teclado.*/
class Gastos{
  public static void main(String args[]){
    //declaración de variables
    float gasto = 0f;
    float gastoFinal = 0f;
    char cond = 'y';

    //Ciclo while y entrada de datos
    while (cond == 'y') {
      System.out.println("Ingrese su gasto");
      gasto = Leer.datoFloat();
      //suma de Gastos
      gastoFinal = gastoFinal + gasto;
      System.out.println("¿Desea ingresar otro gasto? (y / n)");
      cond = Leer.datoChar();
    }
    System.out.println("El total de sus gastos fue: $" + gastoFinal);
  }
}
