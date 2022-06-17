/* Objetivo del programa: Elaborar un algoritmo que  acepte mediante el teclado el radio (r)
de una esfera, calcule y despliegue en pantalla el volumen y el área de la esfera. */

class Esfera{
  //declaración constante PI
  static final float PI = 3.14159f;

  public static void main (String args[]){
    //declaración de variables
    float radio = 0f;
    float volumen = 0f;
    float area = 0f;

    //entrada de datos
    System.out.println("Inserte el radio");
    radio = Leer.datoFloat();

    //calculo area y volumen
    area = (float) 4 * PI * (radio * radio);
    volumen = (float) (((4 * PI) / 3) * (radio * radio * radio));

    //salida de datos
    System.out.println("El área es: " + area + " y el volumen es: "
    + volumen);
  }
}
