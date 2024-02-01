import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListadeFicheros {
    public static void main(String[] args) throws IOException {
        File carpeta = new File("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src");

        String [] contenido= carpeta.list();
        System.out.println("Contenido de la carpeta SCR");
        for (String archivo: contenido) {
            System.out.println(archivo);
        }

        try {
            File fichero= new File("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\listado.txt");
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String archivo:contenido) {
                bw.write(archivo+"\n");
            }
            System.out.println(fichero.getAbsolutePath());
            bw.close();
            System.out.println("Listado de archivos guardados en listado.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error al guardar el listado de archivos");        }
    }
}
