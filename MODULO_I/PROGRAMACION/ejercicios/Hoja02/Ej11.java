// 11. Escribir un programa que imprima las tablas del 1 al 9.

public class Ej11 {
    public static void main(String[] arg) {

        for (int tabla = 1; tabla <= 9; tabla++) {
            System.out.println("\nTABLA DEL: " + tabla);
            for (int i = 1; i <= 10; i++) 
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            
            // System.out.println(); en lugar de \n para salto de línea
        }
    }
}