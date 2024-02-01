/*
Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.*/

public class Ej35_Navidad {
    public static void main(String[] args) {


        System.out.println("Por favor, introduzca su mes : ");
        int B;
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca su dia: ");
        int A;
        A = Integer.parseInt(System.console().readLine());

        
        if (B==12 && A==25) {
            System.out.println("Es Navidad");
        }
        else
        {
            System.out.println("No es Navidad");

        }
    }

}