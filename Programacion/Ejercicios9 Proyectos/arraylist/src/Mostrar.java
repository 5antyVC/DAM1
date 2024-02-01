import java.util.ArrayList;

public class Mostrar {
    public static void main(String[] args) {
        ArrayList<String> asigna = new ArrayList<String>();
        asigna.add("Entorno");
        asigna.add("Programacion");
        asigna.add("Sistema");
        asigna.add("Base de datos");
        asigna.add("Fol");
        asigna.add("Marcas");

        for (String a:asigna) {
            System.out.println("-"+a);
        }

    }
}
