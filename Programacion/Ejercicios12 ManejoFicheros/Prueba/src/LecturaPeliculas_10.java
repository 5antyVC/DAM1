import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaPeliculas_10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Peliculas.txt"));
            //Escribir
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido leer en el fichero");
        }
    }
}
