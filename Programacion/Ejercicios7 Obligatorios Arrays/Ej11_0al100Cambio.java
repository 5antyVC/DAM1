public class Ej11_0al100Cambio {
    public static void main(String[] args) {

        int[] numero = new int[100];
        int i;
    

        // Array lleno de numeros aleatorios
        for (i = 0; i < 100; i++) {
            numero[i] = (int) (Math.random() * 21);
            System.out.print(numero[i] + "  ");
        }

        System.out.print("\nIntroduzca un número de los mostrados: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca al que quiere sustituir: ");
        int valor2 = Integer.parseInt(System.console().readLine());

        System.out.println();

        for (i = 0; i < 100; i++) {
            if (numero[i] == valor1) {
                numero[i] = valor2;
                System.out.print( "\"" + numero[i] + "\"  ");
            } else {
                System.out.print(numero[i] + "  ");
            }
        }
    }
}
