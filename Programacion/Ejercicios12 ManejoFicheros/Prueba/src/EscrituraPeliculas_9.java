import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraPeliculas_9 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Peliculas.txt"));
            //no añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo
            //Escribir
            bw.write("Super Mario\n");
            bw.write("John Wick 4\n");
            bw.write("Infinity War\n");
            bw.write("Endgame\n");
            bw.write("Spiderman 3\n");
            bw.write("Dungeons and dragons\n");

            System.out.println("Peliculas creado");
            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
