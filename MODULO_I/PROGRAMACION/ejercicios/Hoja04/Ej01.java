// 1. Calculadora de 4 operaciones. El usuario ingresa dos números y un carácter (+, -, *, /) y el //programa debe mostrar la operación y su resultado.
// Por ejemplo:
// Ingrese valor: 12.5
// Ingrese valor: 2
// Ingrese operación: -
// 12.5 – 2 = 10.5 

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        double num1, num2, resultado = 0;
        String operacion = "", respuesta = "";
        boolean continuar = true;

        do {
            System.out.print("Ingrese primer número: ");
            num1 = tec.nextDouble();
            System.out.print("Ingrese segundo número: ");
            num2 = tec.nextDouble();
            tec.nextLine(); //limpiar buffer para después cargar un String
            System.out.print("Ingrese operación: ");
            operacion = tec.nextLine();

            switch(operacion) {
                case "+" -> resultado = num1 + num2;
                case "-" -> resultado = num1 - num2;
                case "*" -> resultado = num1 * num2;
                case "/" -> resultado = num1 / num2;
                default -> {
                    System.out.println("Operación no válida");
                    resultado = 0;
                }
            }
            System.out.println(num1 + " " + operacion + " " + num2 + " = " + resultado);
            System.out.println("¿Desea continuar? (s/n): ");
            respuesta = tec.nextLine();
            if (respuesta.equals("n")) 
                continuar = false;
            
        } while (continuar);
            
    }
}