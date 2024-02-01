import java.util.Stack;
public class Pila {
    public static void main(String[] args) {
        //Crear una pila
        Stack<String> pila = new Stack<>();
        //Agregar elementos a la pila
        pila.push("Portatil");
        pila.push("Impresora");
        pila.push("Tablet");
        pila.push("Móvil");
        //Obtener el elemento superior de la pila
        String elementoSuperior = pila.peek();
        System.out.println("El elemento superior(peek) es: "+elementoSuperior);
        //Eliminamos un elemento de la pila
        String elementoEliminado = pila.pop();
        System.out.println("El elemento eliminado(pop) es: "+elementoEliminado);
        //Mostrar todos los elementos de la pila
        while (!pila.empty()) {
            String elemento = pila.pop();
            System.out.println("Elemento: "+elemento);
        }
    }
}
