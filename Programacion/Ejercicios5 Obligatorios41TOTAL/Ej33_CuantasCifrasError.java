/*
Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor*/

public class Ej33_CuantasCifrasError {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero para ver cuantas cifras tiene (Maximo de 3 cifras): ");
        int A = Integer.parseInt(System.console().readLine());
      

        if ((A<=0 && A>=-9) || (A>=0 &&A<=9)) {
            System.out.println("Su numero tiene 1 cifra");
        }
        else if ((A<=-10 && A>=-99) || (A>=10 &&A<=99)) {
            System.out.println("Su numero tiene 2 cifra");

        }
        else if ((A<=-100 && A>=-999) || (A>=100 &&A<=999)) {
            System.out.println("Su numero tiene 3 cifra");

        }
        else 
        {
            System.out.println("ERROR su numero contiene mas del número de cifras permitido");

        }
        
    }

}
