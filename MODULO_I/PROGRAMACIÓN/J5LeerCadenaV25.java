public class J5LeerCadenaV25 {
    public static void main(String[] arg) {
        String nombre;  //Declaro variable nombre de tipo String
        IO.print("Ingresa tu nombre: ");
        nombre = IO.readln(); //Lee desde teclado una cadena y la guarda en variable nombre
        IO.println("Hola " + nombre + " bienvenido!!");
    }
}