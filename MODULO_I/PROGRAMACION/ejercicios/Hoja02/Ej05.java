// 5. Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos.

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num, cant, contPos = 0; 
        System.out.print("¿Cuántos números vas a ingresar?: ");
        cant = tec.nextInt();

        for (int inicio = 1 ; inicio <= cant ; inicio ++ ) {
            System.out.println("Introduce números positivos y negativos: ");
            num = tec.nextInt();
            
            if (num > 0) {
                contPos++;
            }
        }
        System.out.println("Has ingresado " + contPos + " números positivos");

    }
    
}