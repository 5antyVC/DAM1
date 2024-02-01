import java.io.File;
import java.util.Scanner;

public class BorraCarpetaClienteUsuario_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombreCarp="Clientes";
        String ruta = "D:\\Programacion\\Ejercicios12 ManejoFicheros\\Prueba\\src\\";
        File carp = new File(ruta+nombreCarp);

        File[] archivos = carp.listFiles();
        assert archivos != null;
        if (archivos.length > 0) {
            System.out.println("Se eliminarán " + archivos.length + " archivos");
                for (File archivo : archivos) {
                    archivo.delete();
                }
                System.out.println("Carpeta vaciada exitosamente.");
                System.out.println("A continuación procederemos a ELIMINARLA PARA SIEMPREEEEEE");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interupio) {
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
                }
                carp.delete();
                System.out.println("SU CARPETA HA SIDO ELIMINADA. QUE CUNDA EL PÁNICOOC");
            }
        }
    }