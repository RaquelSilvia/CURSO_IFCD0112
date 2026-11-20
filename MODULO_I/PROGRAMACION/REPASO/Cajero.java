// Simula un cajero con un saldo inicial de 1000 euros. Permite al usuario ingresar dinero,
// retirar dinero (validando que no retire más saldo del disponible) o salir del programa.

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double saldo = 1000;
        double cant;
        int opcion;

        do {
            System.out.println("Saldo actual: " + saldo + " €");
        System.out.println(
            """
            Indique la opción deseada:
            1. Ingresar dinero.
            2. Retirar dinero.
            3. Salir.
            """
        );       
        opcion = tec.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cantidad a ingresar: ");
                cant = tec.nextDouble();
                saldo += cant;
                break;
            case 2:
                System.out.println("Cantidad a retirar: ");
                cant = tec.nextDouble();
                
                if (cant < 10) {
                    System.out.println("Lo siento, tiene que ser mínimo 10 €");
                } else if (cant <= saldo) {
                    saldo -= cant;
                    System.out.println("Retirada de " + cant + " € realizada");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                
                break;
            case 3:
                System.out.println("Gracias por usar el cajero automático");
                break;
            default:
                System.out.println("Opción no válida, marque otra");
                break;
        }

        } while (opcion != 3);
    }
}