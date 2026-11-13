import java.util.Scanner;

public class Ej05b {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        double euros, factor;
        boolean salir = false;
        int opcion;
        double dolar = 0.88, libra = 1.2, yen = 0.0077, canada = 0.71;
        String divisa = "";
        

        System.out.print("Ingrese importe: ");
        euros = tec.nextDouble();

        do {
            System.out.println(
                """
                0. Otro importe
                1. Dólares
                2. Libra Esterlina
                3. Yen
                4. Dólares Canadienses
                9. Salir
                """
            );
            System.out.print(">");
            opcion = tec.nextInt();

            switch(opcion) {
                case 0 -> {
                    System.out.print("Ingrese importe: ");
                    euros = tec.nextDouble();
                    tec.nextLine();
                    factor = 0;
                }
                case 1 -> {
                    factor = dolar;
                    divisa = " $ ";
                }
                case 2 -> {
                    factor = libra;
                    divisa = " \u00A3";
                }
                case 3 -> {
                    factor = yen;
                    divisa = " \u00A5";
                }
                case 4 -> {
                    factor = canada;
                    divisa = "CA$";
                }
                case 9 -> {
                    factor = 0;
                    salir = true;
                }
                default -> {
                    factor = 0;
                    divisa = "";
                }

            }
            if (factor != 0) {
                System.out.println(euros + " € >>> " $);
            }
            
        } while(! salir);
        

    }
}    