import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EscrituraFicherosMixtos_8 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Fichero1.txt"));
            String linea1 = "";
            while (linea1 != null) {
                System.out.println(linea1);
                linea1 = br1.readLine();
            }
            br1.close();//Cerradmos el buffer de lectura

            BufferedReader br2 = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Fichero2.txt"));
            String linea2 = "";
            while (linea2 != null) {
                System.out.println(linea2);
                linea2 = br2.readLine();
            }
            br2.close();//Cerradmos el buffer de lectura
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Mezcla.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();//Cerradmos el buffer de lectura

        } catch (IOException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero Texto.txt");
        }
    }
}
