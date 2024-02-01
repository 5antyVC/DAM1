import java.io.*;

public class EscrituraFichero_2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Frutas.txt"));
            //Creamos buffer de escritura

            //Escribir
            bw.write("naranja\n");
            bw.write("mango\n");
            bw.write("chirimoya\n");
            bw.write("fresa\n");
            System.out.println("Fichero creado");
            bw.close();//Cerradmos el buffer de lectura

            //Leer
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Frutas.txt"));
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