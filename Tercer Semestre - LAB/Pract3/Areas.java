import java.util.Scanner;
class Areas{
  /* Calculadora de áreas geométricas de círculo, cuadrado, rectángulo y triángulo.
  Se insertan la base, altura o radio mediante el teclado. */
  public static void main(String[] args){
    //declaración de variables
    Scanner sc = new Scanner(System.in);
    float base = 0f;
    float altura = 0f;
    float radio = 0f;
    float lado = 0f;
    float area = 0f;
    char figura = ' ';

    //entrada de datos
    System.out.println("¿Cual es la figura que desea utilizar?");
    System.out.println("A - CÍRCULO");
    System.out.println("B - CUADRADO");
    System.out.println("C - RECTÁNGULO");
    System.out.println("D - TRIÁNGULO");
    System.out.println("Teclea la opción deseada");
    figura = sc.next().charAt(0);

    //entrada y evaluacion de datos
    if (figura == 'A') {
      System.out.println("Ingresar el radio");
      radio = sc.nextFloat();
      area = (float) (3.14159) * (radio * radio);
    }else if(figura == 'B'){
      System.out.println("Ingresar el lado");
      lado = sc.nextFloat();
      area = (float) lado * lado;
    }else if(figura == 'C'){
      System.out.println("Ingresar la base");
      base = sc.nextFloat();
      System.out.println("Ingresar la altura");
      altura = sc.nextFloat();
      area = (float) base * altura;
    }else if(figura == 'D'){
      System.out.println("Ingresar la base");
      base = sc.nextFloat();
      System.out.println("Ingresar la altura");
      altura = sc.nextFloat();
      area = (float) (base * altura) / 2;
    }else{
      //incorrecta
      System.out.println("Opción incorrecta");
    }

    //salida de datos
    System.out.println("El área es: " + area);
  }
}
