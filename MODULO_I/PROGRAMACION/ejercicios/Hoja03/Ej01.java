// 1. Dados un número indefinido de notas obtenidas por alumnos en sus exámenes, mostrar
// por pantalla la mayor y la menor nota obtenida del grupo. (Cuando el usuario ingrese -1
// finaliza la carga).

import java.util.Scanner;
public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        double notaMayor, notaMenor, nota;

        System.out.print("Ingrese nota: ");
        nota = tec.nextDouble();
        
        notaMayor = notaMenor = nota; 

        while(nota >= 0) {
            if (nota > notaMayor) {
                notaMayor = nota;
                
            } else if (nota < notaMenor) {
                notaMenor = nota;       
            }

            System.out.print("Ingrese otra nota: ");
            nota = tec.nextDouble();
        }
        if (notaMayor >= 0) { // para que no cuente -1 como nota, si no, para finalizar la carga
            System.out.println("La nota mayor es: " + notaMayor);
            System.out.println("La nota menor es: " + notaMenor);
        }
    }
}
