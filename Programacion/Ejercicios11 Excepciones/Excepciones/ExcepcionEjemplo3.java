public class ExcepcionEjemplo3 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3 };

        try {
            int valor = array[3];
            System.out.println("El valor es " + valor);

        } catch (Exception e) {
            System.out.println("Error : indice fuera de rango");

        }
        try {
            String cadena = "hola";
            int valor = Integer.parseInt(cadena);
            System.out.println("El valor es " + valor);

        } catch (Exception e) {

            System.out.println("Error : indice fuera de rango");

        }

        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("El resultado es " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: division entre 0");
        }

    }
}
