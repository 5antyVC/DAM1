import java.util.ArrayList;

public class Modificar2 {
    public static void main(String[] args) {

        String buscar = "Word";

        ArrayList<String> asigna = new ArrayList<String>();
        asigna.add("Entorno");
        asigna.add("Programacion");
        asigna.add("Sistema");
        asigna.add("Base de datos");
        asigna.add("Fol");
        asigna.add("Word");
        System.out.println(asigna);

        

        int position = asigna.indexOf(buscar);

        if (asigna.contains(buscar) == true) {
            asigna.set(position, "Marcas");

        } else {

            System.out.println("La asignatura " + buscar + " No esta en la lista");
            if (asigna.isEmpty() == true) {
                System.out.println("No hay datos");
            } else {
                System.out.println("Hay otras asignaturas");
            }

        }
       
        System.out.println(asigna);


    }
}
