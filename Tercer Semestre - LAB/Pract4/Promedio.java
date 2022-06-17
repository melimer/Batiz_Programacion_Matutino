/*Objetivo: Obtener el promedio de calificaciones de un grupo,
insertadas por el teclado.*/
class Promedio{
  public static void main(String args[]){
    //declaración de variables
    float calif = 0f;
    float total = 0f;
    float promedio = 0f;
    int alumno = 0;
    char cond = 'y';
    //ciclo while
    while (cond == 'y') {
      System.out.println("Ingrese la calificación");
      calif = Leer.datoFloat();
      total = total + calif;
      alumno = alumno + 1;
      System.out.println("¿Desea ingresar otra calificación? (y / n)");
      cond = Leer.datoChar();
    }
    promedio = total / alumno;

    //salida de datos
    System.out.println("El promedio es: " + promedio);
  }
}
