/*Objetivo: Aceptar los nombres de 5 personas, y desplegar cuantos carracter son a, e, i o, o u.*/

import java.util.*;
public class Nombres{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombres[] = new String[5];
        int longitud = 0;
        int aa = 0;
        int ee = 0;
        int ii = 0;
        int oo = 0;
        int uu = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Teclea un nombre");
            nombres[i] = entrada.next();
        }
        for (int i = 0; i < 5; i++) {
            longitud = nombres[i].length();
            for (int j = 0; j < 10; j++) {
                if (nombres[i].charAt(j) == 'a') {
                    ++aa;
                }else if (nombres[i].charAt(j) == 'e') {
                    ++ee;
                }else if (nombres[i].charAt(j) == 'i') {
                    ++ii;
                }else if (nombres[i].charAt(j) == 'o') {
                    ++oo;
                }else if (nombres[i].charAt(j) == 'u') {
                    ++uu;
                }
            }
            System.out.println(nombres[i] + "\n As: " + aa +
            "\n Es: " + ee + "\n Is: " + ii + "\n Os: " + oo + "\n Us: " + uu);
            aa = 0;
            ee = 0;
            ii = 0;
            oo = 0;
            uu = 0;
        }
    }
}
