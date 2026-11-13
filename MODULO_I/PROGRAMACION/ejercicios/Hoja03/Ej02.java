/* 2. Se solicitará al usuario que ingrese números reales para procesar. Luego de ingresar cada
número, se le preguntará si quiere ingresar más o no, leyendo la cadena “s” o “n”. Cuando
indique que no ingresa más números, Mostrar la cantidad de valores ingresados, el primer
valor, el último, el mayor y el menor. */

import java.util.Scanner;
public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int cont = 0; 
        double num, primero = 0, ultimo = 0, mayor = 0, menor = 0;
        String respuesta ="";        

        do {
            System.out.print("Ingrese un número real: ");
            num = tec.nextDouble();   
            //justo después de leer un double/int se salta el string si no ponemos el nextLine         
            tec.nextLine(); //limpio buffer
            cont++;

            if (cont == 1) {
                primero = ultimo = mayor = menor = num;
            }

            // ultimo = num;    también puede ir aquí
            if (num > mayor) {
                mayor = num;
            } else if (num < menor) {
                menor = num;
            }
            
            System.out.println("¿Desea ingresar más números?: \nIndique s (sí) o n (no)");
            respuesta=tec.nextLine();            

        } while(respuesta.equals("s"));

        ultimo = num;
        
        System.out.println("El primer número es: " + primero);
        System.out.println("El último número es: " + ultimo);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La cantidad de números es: " + cont);

    }
}