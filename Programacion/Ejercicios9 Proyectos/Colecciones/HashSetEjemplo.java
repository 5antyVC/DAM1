import java.util.HashSet;

public class HashSetEjemplo {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("superalbertron");
        hashSet.add("pablitron");
        hashSet.add("jabitron");
        hashSet.add("superalbertron"); // Duplicados no se agrega

        System.out.println(hashSet);
    }
}
