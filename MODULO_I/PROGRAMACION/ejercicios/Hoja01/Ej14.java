//14. Hacer un programa que dado un año indicar si es bisiesto. Un año es bisiesto si es un
//número divisible por 4, pero si es divisible por 100 debe ser divisible por 400.
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int anio;

        System.out.print("Ingrese un año: ");
        anio = tec.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0) {       

            System.out.println(anio + " es un año bisiesto");
        
        } else if (anio % 400 == 0) {

            System.out.println(anio + " es un año bisiesto");

        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }
}