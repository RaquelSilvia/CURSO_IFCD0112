public class J9Condicional {
    public void main() {
        int num = Integer.parseInt(IO.readln("Ingrese entero: ")); //parseInt para convertir a entero

        //condicional simple:
        if (num > 0) {
            IO.println(num + " es positivo");
        }

        //condicional doble:
        if (num % 2 == 0) {
            IO.println(num + " es par");
        } else {
            IO.println(num + " es impar");
        }

        //condicional múltiple:
        switch(dia % 7) {
            case 0:
                nombreDia = "Domingo";
                break;
            case 1:
                nombreDia = "Lunes";
                break;
            case 2: 
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
        }
    } 
} 
 

