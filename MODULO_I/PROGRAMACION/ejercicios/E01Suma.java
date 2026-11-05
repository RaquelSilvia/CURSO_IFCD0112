import java.util.Scanner;

public class E01Suma {    
    public static void main(String[] arg) {

        /*
        Scanner tec = new Scanner(System.in); 
        
        int num1,num2;
        
        System.out.print("Ingresa tu primer numero: ");
        num1 = tec.nextInt();

        System.out.print("Ingresa tu segundo numero: ");
        num2 = tec.nextInt();
 
        System.out.println("El resultado es " + (num1+num2));
        */


        int num1, num2;

        num1 = pideNum( "Ingresa tu primer numero: ");
        num2 = pideNum( "Ingresa tu segundo numero: ");

        System.out.println("El resultado de " + num1 + " + " + num2 + " = " +(num1 + num2));
    }

    public static int pideNum(String l) {
        
        Scanner tec = new Scanner(System.in);
        int num;

        while (true) {
            try {
                System.out.print(l);
                num = Integer.parseInt(tec.nextLine());
                return num;

            } catch (NumberFormatException e) {
                System.out.println("Error, introduce un numero entero.");
            }
        }
    }
    
}
