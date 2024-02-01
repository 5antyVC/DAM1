import java.io.*;

public class Pares_5 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Pares.txt"));
            //Creamos buffer de escritura

            int count=0;
            for (int i = 2; i <=100 ; i+=2) {
                bw.write(Integer.toString(i)+ "\n");
             count++;
            }
            bw.close();//Cerradmos el buffer de escritura

            System.out.println("El archivo se ha creado");
            System.out.println("Y su numero total de pares es "+count);

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
