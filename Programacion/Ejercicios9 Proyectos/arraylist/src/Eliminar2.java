import java.util.ArrayList;
import java.util.Arrays;

public class Eliminar2 {
    public static void main(String[] args) {
        ArrayList<String> asigna =new ArrayList<String>(
        Arrays.asList("Entorono","Programcion","Base de Datos","Sistemas","Matematicas"));
    

        System.out.println("Nº de elementos: "+ asigna.size());
        System.out.println(asigna);

        ArrayList<String> elementosEliminar =new ArrayList<String>(
            Arrays.asList("Matematicas","Sistemas", "Entorno"));
            asigna.removeAll(elementosEliminar);

            System.out.println("Nº de elementos de la lista original tras la eliminacion: "+asigna.size());
            System.out.println(asigna);

    }

}
