public class SiAñoBisiesto {
    public static void main(String[] args) {

        String linea;

        System.out.println("Por favor, introduce el numero A: ");
        linea = System.console().readLine();
        int A;
        A = Integer.parseInt(linea);

        if (A % 4 == 0 || A % 100 == 0|| A % 400 == 0) {
            System.out.println("El año " + A + " es bisiesto");
        } else {
            System.out.println("El año " + A + " no es bisiesto");

        }
    }
}