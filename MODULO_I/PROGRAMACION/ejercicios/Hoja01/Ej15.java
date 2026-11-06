//15. Hacer un algoritmo que, dados los catetos de un triángulo rectángulo, calcule su
//hipotenusa. ℎ = √𝑎2 + 𝑏2, con h (hipotenusa), a y b (catetos)

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double a, b, h;

        System.out.print("Ingrese el cateto a del triángulo: ");
        a = tec.nextDouble();
        System.out.print("Ingrese el cateto b del triángulo: ");
        b = tec.nextDouble();

        h = Math.sqrt(Math.pow((a + b), 2));

        System.out.println("El resultado de la hipotenusa del triángulo es: " + h);
    }
}