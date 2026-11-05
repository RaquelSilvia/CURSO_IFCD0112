//3. Dado el radio de un círculo, calcular su perímetro y su área.

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double r, perimetro, area;

        System.out.print("Ingrese el radio del círculo: ");
        r = tec.nextDouble();
        
        perimetro = 2 * Math.PI * r;
        area = Math.PI * r * r; //o Math.PI * Math.pow(r, 2);

        System.out.println("El perímetro del círculo es: " + perimetro);
        System.out.println("El área del círculo es: " + area);

        
    }
}