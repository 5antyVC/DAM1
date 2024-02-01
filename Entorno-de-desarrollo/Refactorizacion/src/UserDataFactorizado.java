import java.util.Scanner;

public class UserDataFactorizado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = askForData("Introduce tu nombre: ", sc);

        String username = askForData("Introduce tu usuario: ", sc);

        sc.close();

        showData("Nombre", name);

        showData("Usuario",
                username);

    }

    private static String askForData(String message, Scanner sc) {

        System.out.print(message);

        return sc.nextLine();

    }

    private static void showData(String label,
String data) {


        System.out.println(label + ":" + data);


    }

}