import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce tu nombre: ");
        String name=sc.nextLine();
        System.out.println("Introduce tu usuario: ");
        String username=sc.nextLine();
        sc.close();
        System.out.println("Nombre: "+name);
        System.out.println("Usuario: "+username);
    }
}
