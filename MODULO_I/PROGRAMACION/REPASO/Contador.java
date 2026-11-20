// Muestra por pantalla los números del 1 al 10 utilizando un bucle do-while.
// Luego modifica el código para que los muestre en orden descendente del 10 al 1.

public class Contador {
    public static void main(String[] args) {
        
        int num = 1;

        do {
            System.out.println(num);
            num++;
        } while (num <= 10);

        num = 10; // para contar al revés
        
        do {
            System.out.println(num);
            num--;
        } while (num >= 1);
    }
}