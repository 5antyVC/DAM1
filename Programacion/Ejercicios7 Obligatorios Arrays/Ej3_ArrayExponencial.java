public class Ej3_ArrayExponencial {
    public static void main(String[] args) {
        //Declaramos los 3 arrays
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        System.out.println("20 Numeros aleatorios comprendidos entre 0 y 100");

        System.out.println("");
        System.out.println("\nSu array queda de la siguiente forma");
        //Generamos los numeros random comprendidos entre 100 y 0
        for (int i = 0; i < 20; i++) {
            numero[i]=((int) (Math.random()*100)+0);
            System.out.print(numero[i] + ", ");

        }
        //Imprime array y hacemos el cuadrado
        System.out.println("");
        System.out.println("\nSu array  cuadrado queda de la siguiente forma");
        for (int i = 0; i < 20; i++) {
            cuadrado[i] = numero[i] * numero[i];
            System.out.print(cuadrado[i] + ", ");
        }
        //Imprime array y hacemos el cubo
        System.out.println("");
        System.out.println("\nSu array cubo queda de la siguiente forma");
        for (int i = 0; i < 20; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
            System.out.print(cubo[i] + ", ");
        }
    }
}