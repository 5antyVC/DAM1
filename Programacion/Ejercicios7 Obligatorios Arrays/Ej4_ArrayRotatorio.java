public class Ej4_ArrayRotatorio {
    public static void main(String[] args) {
        int[] numero = new int[15];
        System.out.println("Introduzca 15 numeros");
        for (int i = 0; i < 15; i++) {
            numero[i]  = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Su array queda de la siguiente forma");
     for (int i = 0; i < 15; i++) {
        System.out.print(numero[i]+", ");

     }
     System.out.println("");
     int temp ;
     System.out.println("\nSu array desplazado queda de la siguiente forma");
    int i;
     for ( i = 0; i < 14; i++) {
        temp=numero[i];
        numero[i]=numero[i+1];
        numero[i+1]=temp;
        System.out.print(numero[i]+", ");
        
     }
     System.out.println(numero[i]);

}
}
