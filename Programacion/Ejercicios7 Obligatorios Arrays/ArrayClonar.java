import java.util.Arrays;
public class ArrayClonar {
    public static void main(String[] args) {
        String[] array1= {"Alberto","Eva", "Laura"};
        String[] array2=array1.clone();//Clona el array
        array1[1]="Cristrina";
        System.out.println(Arrays.toString(array1));//Imprime el array
        System.out.println(Arrays.toString(array2));

        int[][] array3={{2,5,23,15,41},{36,1,87,0,12}};
        int [][] array4=array3.clone();
        array3[0][0]=44;
        array4[0][1]=33;
        System.out.println(Arrays.deepToString(array3));//Imprime el array
        System.out.println(Arrays.deepToString(array4));

    }
}
