import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClienteUsuario_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta="D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\";
        String carpeta="Clientes";
        String archivo="Usuario.txt";

        File fichero = new File(ruta+carpeta);
        File archivito= new File(ruta+archivo);

        fichero.mkdir();
        System.out.println("Carpeta  Creada");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Clientes\\Usuario.txt"));
            //Creamos buffer de escritura
            System.out.println("Introduzca Nombre:");
            String nombre= sc.next();
            bw.write(nombre+"\n");
            System.out.println("Introduzca Contraseña:");
            String contraseña= sc.next();
            bw.write(contraseña);

            bw.close();//Cerradmos el buffer de escritura

            System.out.println("El archivo se ha creado");

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }



}
}