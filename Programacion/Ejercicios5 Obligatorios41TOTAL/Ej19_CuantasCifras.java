/*
Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

*/
public class Ej19_CuantasCifras {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero para ver cuantas cifras tiene : ");
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
        else if ((A<=-1000 && A>=-9999) || (A>=1000 &&A<=9999)) {
            System.out.println("Su numero tiene 4 cifra");

        }
        else if ((A<=-10000 && A>=-99999) || (A>=10000 &&A<=99999)) {
            System.out.println("Su numero tiene 5 cifra");

        }
    }

}
