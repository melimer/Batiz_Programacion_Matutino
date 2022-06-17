/*Objetivo: Calcular y desplegar el total de alumnos menores de edad,
alumnos con 18 años, y alumnos mayores, además del promedio de las edades.*/
class Edades{
  public static void main(String args[]){
    //variables
    int edad = 0;
    float total = 0f;
    int menor = 0;
    int dieciocho = 0;
    int mayor = 0;
    char cond = 's';

    //entrada y evaluación de datos
    while (cond == 's') {
      System.out.println("Ingrese la edad del alumn@");
      edad = Leer.datoInt();
      if (edad < 18) {
        menor = menor + 1; //suma de alumnos menores
      }else if (edad > 18) {
        mayor = mayor + 1; //suma de alumnos mayores de 18
      }else {
        dieciocho = dieciocho + 1; //suma de alumnos de 18 años
      }
      total = total + edad; //suma de todas las edades
      System.out.println("¿Desea ingresar otra edad? (s / n)");
      cond = Leer.datoChar();
    }
    //Salida de datos
    System.out.println("Alumnos menores de edad: " + menor + "\nAlumnos de 18 años: "
    + dieciocho + "\nAlumnos mayores de 18: " + mayor + "\n Promedio de edades: "
    + (total / (menor + dieciocho + mayor)));
  }
}
