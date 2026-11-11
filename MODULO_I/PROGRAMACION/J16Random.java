public class J16Random {
    public static void main(String[] arg) {
        
        // Random: genera número aleatorio entre 1 y 0
        int num;
        int c1, c2, c3, c4, c5, c6;
        int cant = 10000000;
        for (int i = 1; i <= 100; i++);
            // System.out.print(Math.ceilMath.random() * 6); // para adaptarlo multiplicarlo por el rango que quiero, en este caso 6
            // Math.ceil para redondear, hay 3 tipos: ceil (hacia arriba), round (stándar, al entero más cercano) y floor (hacia abajo)
            // Cambio tipo dato a entero con (int):
            num = (int)Math.ceil(Math.random() * 6); // salía un double
            switch(num) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
            }






    }
}