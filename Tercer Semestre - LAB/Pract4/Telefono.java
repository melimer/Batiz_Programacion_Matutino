/*Objetivo: Calcular y desplegar el costo de varias llamadas
telefónicas locales, nacionales e internacionales.
Local ($0.70 >= 5 mins, o $0.80), nacional ($1.50 >= 5 mins, o $1.20) o
internacional ($2.00 >= 5 mins, o $1.80).*/
import java.util.Scanner;
class Telefono{
  public static void main(String args[])
  {
    //declaración de variables
    char opc;
    char cond = 's';
    float inte = 0f;
    float nac = 0f;
    float loc = 0f;
    float dur = 0f;
    //Entrada de datos
    while (cond == 's') {
      System.out.println("TELÉFONOS DE MÉXICO");
      System.out.println("A - LOCAL");
      System.out.println("B - NACIONAL");
      System.out.println("C - INTERNACIONAL");
      System.out.println("TECLEA LA OPCIÓN DESEADA");
      opc =  Leer.datoChar();

      if (opc == 'A' || opc == 'B' || opc == 'C') {
        System.out.println("Teclea la duración (minutos)");
        dur = Leer.datoFloat();
        if (opc == 'A' && dur <= 5) {
          loc = loc + (dur * 0.7f);
        }else if (opc == 'B' && dur <= 5) {
          nac = nac + (dur * 1.5f);
        }else if (opc == 'C' && dur <= 5){
          inte = inte + (dur * 2f);
        }else if (opc == 'A') {
          loc = loc + (dur * 0.8f);
        }else if (opc == 'B') {
          nac = nac + (dur * 1.2f);
        }else{
          inte = inte + (dur * 1.8f);
        }
      }else {
        System.out.println("Opción incorrecta");
      }
      System.out.println("¿Desea ingresar otra llamada? (s/n)");
      cond = Leer.datoChar();
    }
    System.out.println("Los costos son: \nlocal $" + loc + " \nNacional $"
    + nac + " \nInternacional $" + inte + "\nTotal $" + (loc + nac + inte));
  }
}
