import java.util.Scanner;

public class E01SumaNumeros {
    public static void main(String[] arg) { 
        Scanner tec = new Scanner(System.in); //entrada del teclado
        double num1, num2, resul;
        
        System.out.print("Ingresa primer número: ");
        num1 = tec.nextDouble();
        System.out.print("Ingresa segundo número: ");
        num2 = tec.nextDouble();

        res = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + resul);

    }
}