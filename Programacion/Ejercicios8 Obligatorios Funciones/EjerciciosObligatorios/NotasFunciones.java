public class NotasFunciones {
    public static void main(String[] args) {
        System.out.print("Introduzca su nota del 1-10:");
        int notas = Integer.parseInt(System.console().readLine());
        System.out.println(nota(notas));
    }

    public static int nota(int a) {
        
        String nombreMedia="";

        switch (a) {
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
        System.out.println(nombreMedia);
        return a;
    }
}
