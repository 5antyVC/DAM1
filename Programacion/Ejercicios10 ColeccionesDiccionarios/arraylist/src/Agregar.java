import java.util.ArrayList;

public class Agregar {
    public static void main(String[] args) {
        ArrayList<String> asigna = new ArrayList<String>();
        System.out.println("Nº de elementos " + asigna.size());
        asigna.add("Entorno");
        asigna.add("Programacion");
        asigna.add("Sistema");
        asigna.add("Base de datos");
        asigna.add("Fol");
        asigna.add("Marca");

        for (int i = 0; i < asigna.size(); i++) {
            System.out.println("La posicion " + i + " del array es " + asigna.get(i));

        }

    }
}
