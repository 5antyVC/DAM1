/*
Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
*/

public class Ej8_MediaNotasDiciendoNota {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce la primera nota: ");
        int A = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce la segunda nota: ");
        int B = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce la ultima nota: ");
        int C = Integer.parseInt(System.console().readLine());

        int media = ((A + B + C) / 3);
        System.out.println("La media de sus notas es " + media);

        String nombreMedia="";

        switch (media) {
            case 1, 2, 3, 4:
                nombreMedia = "Suspenso";
                break;
            case 5:
                nombreMedia = "Aprobado";
                break;
            case 6:
                nombreMedia = "Bien";
                break;
            case 7:
                nombreMedia = "Notable bajo";
                break;
            case 8:
                nombreMedia = "Notable alto";
                break;
            case 9:
                nombreMedia = "Sobresaliente";
                break;
            case 10:
                nombreMedia = "Matricula de honor";
                break;
            default:
                nombreMedia = "Haz introducido una nota mal, por favor revisalo";
                break;

        }
        System.out.println("Tu nota media es  " + media + " corresponde a " + nombreMedia);

    }
}
