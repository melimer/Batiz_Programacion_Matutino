import java.util.Scanner;
class Calculadora{
  /* Calculadora de dos número con las operaciones aritméticas básicas.*/
  public static void main(String[] args){
    //declaración de variables
    Scanner sc = new Scanner(System.in);
    float num1 = 0f;
    float num2 = 0f;
    float res = 0f;
    int op = 0;

    //entrada de datos
    System.out.println("¿Cual es la operación que desea realizar?");
    System.out.println("1 - SUMA");
    System.out.println("2 - RESTA");
    System.out.println("3 - MULTIPLICACIÓN");
    System.out.println("4 - DIVISIÓN");
    op = sc.nextInt();

    System.out.println("Ingresar el primer numero");
    num1 = sc.nextFloat();

    System.out.println("Ingresar el segundo numero");
    num2 = sc.nextFloat();

    //evaluacion de datos obtenidos
    if(op == 1 || op == 2 || op == 3 || op == 4){
      //proceso
      if (op == 1) {
          res = (float) num1 + num2;
        }else if (op == 2) {
          res = (float) num1 - num2;
        }else if(op == 3){
           res = (float) num1 * num2;
        }else {
          res = (float) num1 / num2;
        }
      }else{
      //incorrecta
      System.out.println("Opción incorrecta");
    }

    //salida de datos
    System.out.println("La respuesta es: " + res);
  }
}
