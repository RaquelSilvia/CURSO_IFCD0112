//19. Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número
//con el día del año (de 1 a 366) e imprima el día de la semana que le toca. Por ejemplo: si
//recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’.

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int numDia;

        while (true) {
                
            System.out.print("Ingresa un número del 1 al 366: ");
            numDia = tec.nextInt();

            if (numDia % 7 == 1){
                System.out.println("Lunes ");

            }else if (numDia % 7 == 2){
                System.out.println("Martes ");

            }else if (numDia % 7 == 3){
                System.out.println("Miércoles ");

            }else if (numDia % 7 == 4){
                System.out.println("Jueves ");

            }else if (numDia % 7 == 5){
                System.out.println("Viernes ");

            }else if (numDia % 7 == 6){
                System.out.println("Sábado ");

            }else if (numDia % 7 == 0){
                System.out.println("Domingo ");
            }
        }
    }
}