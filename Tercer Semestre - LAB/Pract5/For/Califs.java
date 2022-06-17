/*Objetivo: Aceptar 10 calificaciones y encontrar cuantas
son 10, 9, 8, 7, 6 y menores a 6, y desplegar el resultado en pantalla.*/

class Califs{
  public static void main(String[] args){
  //variables
  int calif=0, diez=0, nueve=0, ocho=0, siete=0, seis=0, reprobados=0;

  //entrada de datos y for
  for (int i = 1; i <= 10 ; i++ ) {
    System.out.println("Ingrese una calificación");
    calif = Leer.datoInt();
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
  }
  //despliegue de datos
  System.out.println(diez + " alumnos tienen 10.\n"
  + nueve + " alumnos tienen 9.\n" + ocho +
  " alumnos tienen 8.\n" + siete + " alumnos tienen 7.\n" + seis
  + " alumnos tienen 6.\n" + reprobados + " alumnos reprobaron.\n");
  }
}
