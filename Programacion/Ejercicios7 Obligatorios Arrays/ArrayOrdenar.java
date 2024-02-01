import java.util.Arrays;
import java.util.Collections;

public class ArrayOrdenar {
    public static void main(String[] args) {

        String[] array1 = { "Eva", "Laura", "Alberto" };
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));// Imprime por orden alfabetico
        // repetir el proceso
        System.out.println("Array Original" + Arrays.toString(array1));// Imprime array con texto
        Collections.reverse(Arrays.asList(array1));//array revertido
        System.out.println("Array revertido: " + Arrays.toString(array1));
    }
}
