import java.util.HashMap;

public class HashMapEjemplo {
    public static void main(String[] args) {

        HashMap<String, String> emails = new HashMap<>();
        HashMap<String, Integer> pass = new HashMap<>();

        emails.put("Santiago Velasquez 1", "supersonicrpg@hotmail.com");
        pass.put("Santiago Velasquez 1", 1597530);
        emails.put("Santiago Velasquez 2", "sonicexone_@hotmail.com");
        pass.put("Santiago Velasquez 2", 1597530);
        emails.put("Santiago Velasquez 3", "santiagovelasquezcalderon@hotmail.com");
        pass.put("Santiago Velasquez 3", 1597530);

        String email = emails.get("Santiago Velasquez 3");
        Integer passwords = pass.get("Santiago Velasquez 3");

        System.out.println(
                "El correo electtonico de Santiago Velasquez 3 es: " + email + " y la contraseña es: " + passwords);

        for (String key : emails.keySet()) {
            String value = emails.get(key);
            System.out.println(key + " -> " + value);
        }
        for (String key : pass.keySet()) {
            Integer value = pass.get(key);
            System.out.println(key + " -> " + value);
        }

    }
}
