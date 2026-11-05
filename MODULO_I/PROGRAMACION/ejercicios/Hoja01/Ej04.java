//4. Dados la base y altura de un triángulo, calcular su área. (b*a/2)

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Ingrese la base del triángulo: ");
        base = tec.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = tec.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);

    }
}