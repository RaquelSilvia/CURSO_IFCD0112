//2. Dados los lados de un rectángulo, calcular su perímetro y su área.

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double base, altura, perimetro, area;

        System.out.print("Ingresa la base del rectángulo: ");
        base = tec.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        altura = tec.nextDouble();

        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        
    }

}