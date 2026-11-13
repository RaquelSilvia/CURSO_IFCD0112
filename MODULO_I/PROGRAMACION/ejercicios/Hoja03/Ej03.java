// 3. El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo
// adivine. Cuando el usuario ingrese el número para ver si acertó, el programa le indicará si
// el número a adivinar es mayor, menor o bien si acertó. Cuando acierte, finaliza.

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num = (int) Math.floor(Math.random() * 101);
        boolean acierto = false;
        int intento, cont = 0; // opcional, contando los intentos

        System.out.println("Número secreto (prueba): " + num); // para verlo al probar el programa

        do {
            System.out.print("¿Cuál es mi número?: ");
            intento = tec.nextInt();
            cont++;
            if (intento == num) {
                acierto = true;
            } else if (intento < num) {
                System.out.println("El " + intento + " es menor que mi número");
            } else if (intento > num) {
               System.out.println("El " + intento + " es mayor que mi número");
            }
        } while(!acierto);  // lo mismo que: while(intento != num);
        
        System.out.println("Felicitaciones!!!, has acertado en " + cont + " intentos!!!");

    }
}