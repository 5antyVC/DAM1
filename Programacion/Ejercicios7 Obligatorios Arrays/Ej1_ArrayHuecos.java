public class Ej1_ArrayHuecos {
    public static void main(String[] args) {
        int[] num = new int[12];
//Creas array y se declara valores y dejamos los huecos vacios los cuales dan 0
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        num[11] = 0;

        System.out.println("El array n contiene los siguientes elementos: ");
//Imprime array
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + ", ");
        }

    }
}
