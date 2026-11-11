// 13. Escribir un programa que imprima por pantalla todas las fichas de dominó, de una por línea y sin repetir.
// 0 : 0
// 0 : 1
// …

public class Ej13 {
    public static void main(String[] arg) {

        for (int ficha = 0; ficha <= 6; ficha++) {
            System.out.println("------");
            for (int puntos = ficha; puntos <= 6; puntos++) { // comienza en "ficha" para que no se repita
                System.out.println(ficha + " : " + puntos);

            }
        }
    }
}