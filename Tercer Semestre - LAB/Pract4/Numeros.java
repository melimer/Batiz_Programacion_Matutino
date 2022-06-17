/*Objetivo: Hacer un "mini juego" de adivinanza mediante un número
aleatorio entre 1 y 5 escogido por la computadora que el usuario debe de adivinar
y teclear.*/
class Numeros{
  public static void main(String [] args){
    //inicialización de variables Math.floor(Math.random()* 5 + 1);
    int numUser = 0;
    double numCompt = Math.floor(Math.random()* 5 + 1);
    char cond = 's';
    //entrada y procesamiento de datos
    while (cond != 'n') {
      System.out.println("Inserte un número");
      numUser = Leer.datoInt();
      //if para comprobar que el numero insertado es el mismo que el generado.
      if (numUser == numCompt) {
        System.out.println("¡Le atinaste!");
        //para asignarle un nuevo valor a numCompt si es que le atina
        numCompt = Math.floor(Math.random()* 5 + 1);
      }else {
        System.out.println("No le atinaste :(");
      }
      //condición para ciclo while
      System.out.println("¿Quiere volver a intentar? (s / n)");
      cond = Leer.datoChar();
    }
  }
}
