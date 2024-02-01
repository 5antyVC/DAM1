public class Ej2_ArrayalReves {
    public static void main(String[] args) {
      //Declara Array
        int[] a= new int[10];
      //Asinamos numeros a posiciones de array
        System.out.println("Introduzca 10 numeros");
     for (int i = 0; i < 10; i++) {
        int n=Integer.parseInt(System.console().readLine());
        a[i]=n;        
     }     
     //Imprime array
     System.out.println("Su array queda de la siguiente forma");
     for (int i = 0; i < 10; i++) {
        System.out.print(a[i]+", ");

     }
     //Damos la vuelta del array
     System.out.println("");
     System.out.println("Su array al reves queda de la siguiente forma");
     for (int i = 9; i >= 0; i--) {
        System.out.print(a[i]+", ");

     }
}
}