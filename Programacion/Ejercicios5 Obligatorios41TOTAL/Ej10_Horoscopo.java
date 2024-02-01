/*
Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
*/

public class Ej10_Horoscopo  {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca su dia: ");
        int A = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, introduzca su mes: ");
        int B = Integer.parseInt(System.console().readLine());


        if ((A>=21 && B==3) || (A<=20 && B==4)) {
            System.out.println("Su signo es Aries ");

        }
        else if ((A>=21 && B==4) || (A<=21 && B==5)) {
            System.out.println("Su signo es Tauros ");

        }
        else if ((A>=22 && B==5) || (A<=21 && B==6)) {
            System.out.println("Su signo es Geminis ");

        }
        else if ((A>=22 && B==6) || (A<=22 && B==7)) {
            System.out.println("Su signo es Cancer ");

        }
        else if ((A>=23 && B==7) || (A<=22 && B==8)) {
            System.out.println("Su signo es Leo ");

        }
        else if ((A>=23 && B==8) || (A<=22 && B==9)) {
            System.out.println("Su signo es Virgo ");

        }
        else if ((A>=23 && B==9) || (A<=22 && B==10)) {
            System.out.println("Su signo es Libra ");

        }
        else if ((A>=23 && B==10) || (A<=22 && B==11)) {
            System.out.println("Su signo es Escorpio ");

        }
        else if ((A>=23 && B==11) || (A<=21 && B==12)) {
            System.out.println("Su signo es Sagitario ");

        }
        else if ((A>=22 && B==12) || (A<=20 && B==1)) {
            System.out.println("Su signo es Capricornio ");

        }
        else if ((A>=21 && B==1) || (A<=19 && B==2)) {
            System.out.println("Su signo es Acuario ");

        }
        else if ((A>=20 && B==2) || (A<=20 && B==3)) {
            System.out.println("Su signo es Piscis ");

        }
        
       
    }
    
}