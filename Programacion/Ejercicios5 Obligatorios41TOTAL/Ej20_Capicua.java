/*
Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.

*/

public class Ej20_Capicua {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero para ver si es capicuo : ");
        int A = Integer.parseInt(System.console().readLine());
        boolean capicua=false;

        if (A<10) {

            capicua =true;
        }
        

        else if ((A>=10) && (A<=100)) {
            if ((A/10) == (A%10)) {
                capicua =true;

            }
        }
       else if ((A>=100) && (A<=1000)) {
        if ((A/100)==(A%10)) {
            capicua=true;
        }
       }
       else if ((A>=1000) && (A<=10000)) {
        if (((A/1000)==(A%10)) && (A/100)%10 ==(A/10)%10) {
            capicua=true;

        }
       }
       else if (A>=10000) {
        if (((A/1000)==(A%10)) && ((A/10000)%10)==((A/10)%10)) {
            capicua=true;

        }
        
       }

       if (capicua) {
        System.out.println("El número introducido es capicúa.");
      } else {
        System.out.println("El número introducido no es capicúa.");
      }
    }

}
