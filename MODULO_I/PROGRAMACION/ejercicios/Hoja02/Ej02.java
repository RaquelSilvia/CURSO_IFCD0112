// 2. Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por
// teclado.

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num, cont = 1, suma = 0; 
        System.out.print("Dime un número para sumar todos desde el 0:  ");
        num = tec.nextInt();

        while (cont <= num){
        
            System.out.println("suma es : " + suma);
            System.out.println("contador es : " +cont);
            suma += cont;           
            cont++;
        }
        
        System.out.println(suma);
    }
}