import java.util.LinkedList;
import java.util.Queue;

public class QueueEjemplo {
    public static void main(String[] args) {
        
        Queue<String> cola = new LinkedList<>();

        cola.add("Blanco");
        cola.add("Verde");
        cola.add("Azul");
        cola.add("Amarillo");
        System.out.println("Los colores son: "+cola);

        String primerElto = cola.peek();
        System.out.println("El primer color es: "+primerElto);

        String eltoEliminado =cola.remove();
        System.out.println("El color eliminado es: "+eltoEliminado);

        System.out.println("Los colores ahora son: "+cola);


        String valor="Azul";
        if(cola.contains(valor))
        {
            System.out.println("Se encontro el valor "+valor);
        }
        else{
            System.out.println("No se encontro el valor "+valor);
        }

        LinkedList<String> lista = new LinkedList<>(cola);
        String ultimoElto = lista.getLast();
        cola.remove(ultimoElto);

        cola.clear();
        System.out.println("Los colores ahora son "+cola);

    }

}
