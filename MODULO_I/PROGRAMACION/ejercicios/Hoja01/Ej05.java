//5. Dado el radio de una esfera, calcular su volumen. 𝑉 = 4/3 𝜋𝑟^3
 
import java.util.Scanner;

public class Ej05 {
    public static void main(String[] arg) {
        
        Scanner tec = new Scanner(System.in);
        double r, volumen;

        System.out.print("Ingrese el radio de la esfera: ");
        r = tec.nextDouble();

        volumen = (4. / 3) * Math.PI * Math.pow(r, 3); //Si ponemos . detrás de un literal lo interpreta double

        System.out.println("El volumen de la esfera es: " + volumen);
        
    }
}
