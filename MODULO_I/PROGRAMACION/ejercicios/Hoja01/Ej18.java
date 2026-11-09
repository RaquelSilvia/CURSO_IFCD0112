//18. Escribir un programa que dados dos puntos en el plano 𝐴(𝑥1, 𝑦1) y 𝐵(𝑥2, 𝑦2), imprima la
//distancia entre ambos.
//𝑑(𝐴, 𝐵) = √(𝑥2 − 𝑥1)2 + (𝑦2 − 𝑦1)2

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] arg) {

        Scanner tec = new Scanner(System.in);
        double x1, y1, x2, y2, dist;

        System.out.print("Dame la primera coordenada del punto 'A': ");
        x1 = tec.nextDouble();

        System.out.println("Dame la segunda coordenada del punto 'A': ");
        y1 = tec.nextDoubleo();

        System.out.println("Dame la primera coordenada del punto 'B': ");
        x2 = tec.nextDoubleo();

        System.out.println("Dame la segunda coordenada del punto 'B': ");
        y2 = tec.nextDouble();

        //raiz
        //Math.sqrt(número)

        //potencia
        //Math.pow(base, 2); 

        dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.print("La distancia entre los puntos es: 𝑑(𝐴, 𝐵) =  " + dist);
    }
}