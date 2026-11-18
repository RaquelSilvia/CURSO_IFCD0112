// 14. Hacer un programa que dado un año indicar si es bisiesto. Un año es bisiesto si es un
// número divisible por 4, pero si es divisible por 100 debe ser divisible por 400.

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int anyo;

        System.out.print("Ingrese un año: ");
        anyo = tec.nextInt();

        if (anyo % 4 == 0 && anyo % 100 != 0) {       

            System.out.println(anyo + " es un año bisiesto");
        
        } else if (anyo % 400 == 0) {

            System.out.println(anyo + " es un año bisiesto");

        } else {
            System.out.println(anyo + " no es un año bisiesto");
        }
    }
}