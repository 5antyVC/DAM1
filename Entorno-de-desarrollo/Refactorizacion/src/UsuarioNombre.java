
/*
 * import java.util.Scanner;
 * 
 * public class UsuarioNombre {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Introduce tu nombre: ");
 * String nombre = sc.nextLine();
 * System.out.println("Introduce tu usuario: ");
 * String usuario = sc.nextLine();
 * System.out.println("Introduce tu contraseña: ");
 * String contraseña = sc.nextLine();
 * sc.close();
 * System.out.println("Nombre: "+nombre);
 * System.out.println("Nombre: "+usuario);
 * System.out.println("Nombre: "+contraseña);
 * 
 * 
 * }
 * }
 * 
 */

import java.util.Scanner;

public class UsuarioNombre {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String Nombre = pedirDatos("Introduzca Nombre: ");
        System.out.println("Su Nombre es "+Nombre);
        String Usuario = pedirDatos("Introduzca Usuario: ");
        System.out.println("Su Usuario es "+Usuario);
        String Contraseña = pedirDatos("Introduzca Contraseña: ");
        System.out.println("Su Contraseña es "+Contraseña);

    }

    public static String pedirDatos(String string) {
        String dato;
        System.out.print(string);
        dato = sc.nextLine();
        return dato;
    }

}
