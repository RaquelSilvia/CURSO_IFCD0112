//11. Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos de un
//tiempo dado en segundos.

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] arg) { 
        
        Scanner tec = new Scanner(System.in);
        
        int min, segRestantes, horas , seg , minRestantes;

        System.out.print("Ingrese los segundos: ");

        seg = tec.nextInt();
        segRestantes = seg % 60;

        min= seg / 60;
        minRestantes = min % 60;

        horas= min / 60;

        System.out.print( seg + " segundos son " + horas + " : " + minRestantes + " : " + segRestantes);
    
    }
}

