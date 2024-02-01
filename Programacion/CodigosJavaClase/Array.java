/*
 * Ejemplo de Array 
 */
public class Array {
    public static void main(String[] args) {
        

        int [] n; //se define n como un arrayde enteros
        n=new int[4];   // se reserva espacio para 4 huecos

        n[0]=20;
        n[1]=-30;
        n[2]=0;
        n[3]=100;

        System.out.print("Los valores del array son los siguientes: ");
        System.out.print(n[0]+", "+n[1]+", "+n[2]+", "+n[3]);

        int suma= n[0]+n[3];

        System.out.print("\nel primer elemento del array mas el ultimo suman: ");
        System.out.println(suma);
    }
}
