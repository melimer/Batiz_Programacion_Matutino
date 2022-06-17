/*Objetivo: Obtener la cantidad de alumnos
que obtuvieron 10, 9, 8, 7, 6 y los que reprobaron.
Las calificaciones son desplegadas mediante el teclado.*/
class Calificaciones{
  public static void main(String args[]){
    //declaración de variables
    int calif=0, diez=0, nueve=0, ocho=0, siete=0, seis=0, reprobados=0;
    char cond = 's';

    //ciclo while, entrada de datos
    while (cond == 's') {
      System.out.println("Ingrese una calificación");
      calif = Leer.datoInt();
      //evaluación de datos
      if (calif > 9) {
        diez = diez + 1;
      }else if (calif > 8) {
        nueve = nueve + 1;
      }else if (calif > 7) {
        ocho = ocho + 1;
      }else if (calif > 6) {
        siete = siete + 1;
      }else if (calif > 5) {
        seis = seis + 1;
      }else {
        reprobados = reprobados + 1;
      }
      System.out.println("¿Quiere ingresar otra calificación? (s / n)");
      cond = Leer.datoChar();
    }
    //salida de datos
    System.out.println(diez + " alumnos tienen 10.\n"
    + nueve + " alumnos tienen 9.\n" + ocho +
    " alumnos tienen 8.\n" + siete + " alumnos tienen 7.\n" + seis
    + " alumnos tienen 6.\n" + reprobados + " alumnos reprobaron.\n");
  }
}
