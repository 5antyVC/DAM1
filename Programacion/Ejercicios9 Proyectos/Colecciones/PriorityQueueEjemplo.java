import java.util.PriorityQueue;
public class PriorityQueueEjemplo {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Rojo");
        priorityQueue.add("Amarillo");
        priorityQueue.add("Azul");

        System.out.println("PriorityQueue: "+priorityQueue);

        String firstElement = priorityQueue.poll();
        System.out.println("Primer elemento: "+firstElement);

        System.out.println("PriorityQueue después de remover el primer elemento: "+priorityQueue);
    }
}
