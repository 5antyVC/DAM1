import java.util.ArrayList;

public class Modificar {
    public static void main(String[] args) {

        String buscar ="Word";

        ArrayList<String> asigna = new ArrayList<String>();
        asigna.add("Entorno");
        asigna.add("Programacion");
        asigna.add("Sistema");
        asigna.add("Base de datos");
        asigna.add("Fol");
        asigna.add("Word");
        System.out.println("Nº de elementos: " + asigna.size());
        System.out.println(asigna);

        for (int i = 0; i < asigna.size(); i++) {
            System.out.println("La posicion " + i + " del array es " + asigna.get(i));

        }


        int position=asigna.indexOf(buscar);
        System.out.println("La posicion word es "+position);
        asigna.set(position, "Marcas");
        for (int i = 0; i < asigna.size(); i++) {
            System.out.println("La posicion " + i + " del array es " + asigna.get(i));

        }
        asigna.removeIf(asignatura -> asignatura.equals("matematicas"));
        System.out.println(asigna);

    }
}
