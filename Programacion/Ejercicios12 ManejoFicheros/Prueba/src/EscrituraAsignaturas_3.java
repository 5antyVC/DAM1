import java.io.*;

public class EscrituraAsignaturas_3 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\ASignaturas.txt"));
            //no añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo
            //Escribir
            bw.write("FOL\n");
            bw.write("Marcas\n");
            bw.write("Sistemas\n");
            bw.write("Entorno\n");
            bw.write("Programacion\n");
            bw.write("Base\n");

            System.out.println("Fichero creado");
            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
