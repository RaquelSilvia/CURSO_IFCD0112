import java.util.Scanner;

public class J4LeerCadena {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in); //Declaramos objeto tec (teclado) de la clase Scanner 
        String nombre;  //Declaro variable nombre de tipo String
        System.out.print("Ingresa tu nombre: ");
        nombre = tec.nextLine(); //Lee desde teclado una cadena y la guarda en variable nombre
        System.out.println("Hola " + nombre + " bienvenido!!");
    }
}
