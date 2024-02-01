public class Array03 {
    public static void main(String[] args) {
        int[] n= new int[10];

        n[0]=8;
        n[1]=33;
        n[2]=200;
        n[3]=150;
        n[4]=11;
        n[5]=88;
        n[6]=n[2]*10;
        n[7]=n[2]/10;
        n[8]=n[0]+n[1]+n[2];
        n[9]=n[8];

        System.out.println("El array n contiene los siguientes elementos: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(n[i]+", ");
        }


    }
}
