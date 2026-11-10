// Combinando ejemplo del Ej03 de Hoja02
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        
        int n;
        double num, mayor = 0;
        System.out.print("¿Qué cantidad de números ingresarás?: ");
        n = tec.nextInt();

        // for (sentencia_inicializzación; exp_lógica; sentencia_actualización)
        for (int i = 1; i <= num; i++) {
            // procesa
            System.out.print("Ingrese número: ");
            num = tec.nextDouble();
            if (i == 1)
                mayor = num;
            if (num > mayor)
                mayor = num;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
}