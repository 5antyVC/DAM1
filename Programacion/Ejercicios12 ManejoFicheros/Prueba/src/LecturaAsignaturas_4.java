import java.io.*;

public class LecturaAsignaturas_4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\ASignaturas.txt"));
            //Escribir
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
