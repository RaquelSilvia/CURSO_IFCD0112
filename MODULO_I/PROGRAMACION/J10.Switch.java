public class J10Switch {
    public void main() {
        int valor = 4;

        switch(valor) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
            case 3:
                System.out.println("Tres");

            case 4:
                System.out.println("Cuatro");

            case 5:
                System.out.println("Cinco");
            default:
                System.out.println("Otro valor");
        }
        // aquí después del break;
        // default, por defecto, si no entra en ningún caso anterior
    }
}