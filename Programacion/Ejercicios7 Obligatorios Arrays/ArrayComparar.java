import java.util.Arrays;
public class ArrayComparar {
    public static void main(String[] args) {
        int [] array1={1,2,3};
        System.out.println(Arrays.toString(array1));// Imprime por orden alfabetico

        int [] array2={3,2,1}; 
        System.out.println(Arrays.toString(array2));// Imprime por orden alfabetico

        boolean areEqual=Arrays.equals(array1, array2);//Comprueba si ambos son iguales
        System.out.println(areEqual);//Imprime true
        Arrays.sort(array2);

         areEqual=Arrays.equals(array1, array2);//Comprueba si ambos son iguales
        System.out.println(areEqual);//Imprime true

       
    }
}
