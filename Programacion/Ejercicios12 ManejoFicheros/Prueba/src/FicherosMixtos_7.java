import java.io.*;

public class FicherosMixtos_7 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Fichero1.txt"));
            //Lectura Fichero1
            BufferedReader br2 = new BufferedReader(new FileReader("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Fichero2.txt"));
            //Lectura Fichero2



            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\Mezcla.txt"));

            String linea1 = "";
            String linea2 = "";
            while ( (linea1 != null) || (linea2 != null) ) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();
                if (linea1 != null) {
                    bw.write(linea1 + " ");
                }
                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
            System.out.println("Archivo mezcla.txt creado satisfactoriamente.");
        } catch (IOException ioe) {
            System.out.println("No se ha podido leer en el fichero");
        }
    }
}
