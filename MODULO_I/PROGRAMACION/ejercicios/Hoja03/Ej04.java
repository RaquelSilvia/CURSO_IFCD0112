// 4. Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. En
// cada paso, el programa propone un número y el usuario debe contestar, introduciendo su
// contestación como dato, si ha acertado, o bien si el número que ha propuesto el
// ordenador es mayor o es menor que el que tenía pensado. Por ejemplo, ingresando:
// 0 –> Acierto
// 1 –> El valor propuesto es mayor
//-1 –> El valor propuesto es Menor

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int min = 0, max = 100, intento, respuesta;

        System.out.print("Piensa un número entre " + min + " y " + max);
        System.out.println("Indica si he acertado con 0, si el propuesto es mayor con 1, o si es menor con -1");

        do {
            intento = (min + max) / 2;
            System.out.println("Es el " + intento + "?: ");
            respuesta = tec.nextInt();  

            if (respuesta == 1) {
                max = intento;  // también: max = intento + 1;
            } else if (respuesta == -1) {
                min = intento;  // también: min = intento - 1;
            }   
        
        } while(respuesta != 0); 

        System.out.println("He acertado!!!, tu número es el " + intento);
    }
}