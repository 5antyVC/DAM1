public class Ej13_ParImpar {
    public static void main(String[] args) {

        int[] numero = new int[8];
        int i;


        for (i = 0; i < 8; i++) {
            System.out.println("Introduzca el "+i+"º número:");

            numero[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();

        for (i = 0; i < 8; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " par");
            } else {
                System.out.println(numero[i] + " impar");
            }
        }
    }
}
