import java.util.LinkedHashMap;

public class LikedHasMapEjemplo {

    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> linkedHahsMap = new LinkedHashMap<>();
        linkedHahsMap.put("Java",1);
        linkedHahsMap.put("C++",2);
        linkedHahsMap.put("JavaScript",3);

        System.out.println("LinkedHashMap: "+linkedHahsMap);

        int value=linkedHahsMap.get("Java");
        System.out.println("Valor asociado a la clave 'java': "+value);

        



    }
}