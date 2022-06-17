import java.util.*;
public class Calificaciones {
    public static void main(String[] args){
        //variables
        Scanner entrada = new Scanner(System.in);
        String[] nombre = new String[10];
        int[] primero = new int[10];
        int[] segundo = new int[10];

        //aceptar nombres
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserte el nombre del alumno:");
            nombre[i] = entrada.nextLine();

            System.out.println("Inserte la calificación del primer parcial:");
            primero[i] = entrada.nextInt();

            System.out.println("Inserte la calificación del segundo parcial:");
            segundo[i] = entrada.nextInt();
        }
        //realizar las multiplicaciones, desplegar nombre, calificaciones y promedio
            }
}
