// 5. Escribir un programa que pida al usuario un número, que representará una cantidad de
// dinero expresada en euros. A continuación, el programa le ofrecerá un menú al usuario en
// el que le preguntará a qué divisa quiere convertir del dinero e imprimirá la conversión. Las
// posibles divisas son las siguientes (se indica el tipo de cambio):
//• Dólares (1 dólar = 0,88 euros)
//• Libra Esterlina (1 Libra = 1,20 euros)
//• Yen (1 yen = 0,0077 euros).
//• Dólares Canadienses (1 dólar C. = 0,71 euros)

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        double num, divisa;

        System.out.print("Ingrese un número real: ");
        num = tec.nextDouble();
        System.out.println("Has introducido " + num + " € ");
        System.out.println(     // text block: en bloque, sin poner los saltos u otros, entre 3 comillas dobles
            """
            ¿A qué divisa quieres convertir?
            Elige número de opción: 
            1. Dólares
            2. Libra Esterlina
            3. Yen
            4. Dólares Canadienses

            """
        );
        divisa = tec.nextInt();
        switch(divisa) {
            case 1:
                divisa = num / 0.88;
                System.out.println("Son " + divisa + " $");
                break;
            case 2:
                divisa = num / 1.20;
                System.out.println("Son " + divisa + " ");
                break;
            case 3:
                divisa = num / 0,0077;
                System.out.println("Son " + divisa + " ¥");
                break;
            case 4:
                divisa = num / 0.71;
                System.out.println("Son " + divisa + " $ canadienses");
                break;
            default;
        }

    }
}