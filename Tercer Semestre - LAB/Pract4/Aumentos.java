class Aumentos{
  public static void main(String args[]){
    //variables
    float sueldo = 0f;
    float total = 0f;
    String nombre = "";
    char cond = 'y';
    //ciclo while
    while (cond == 'y') {
      System.out.println("Ingrese el nombre del empleado");
      nombre = Leer.dato();
      System.out.println("Ingrese el sueldo del empleado");
      sueldo = Leer.datoFloat();
      if (sueldo < 1000) {
        sueldo = sueldo * 1.12f;
        System.out.println(nombre + " su nuevo sueldo es: " + sueldo);
      }else if (sueldo == 1000 || sueldo <= 2500) {
        sueldo = sueldo * 1.1f;
        System.out.println(nombre + " su nuevo sueldo es: " + sueldo);
      }else {
        sueldo = sueldo * 1.08f;
        System.out.println(nombre + " su nuevo sueldo es: " + sueldo);
      }
      total = total + sueldo;
      System.out.println("¿Desea ingresar otro sueldo? (y / n)");
      cond = Leer.datoChar();
    }
    System.out.println("El total de sueldos a pagar es: " + total);
  }
}
