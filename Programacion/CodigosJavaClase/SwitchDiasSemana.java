public class SwitchDiasSemana {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca un numero de dia: ");

        int dia=Integer.parseInt(System.console().readLine());

        String nombredia;

        switch (dia) {
            case 1:
                nombredia="Lunes";
                break;
                case 2:
                nombredia="Martes";
                break;
                case 3:
                nombredia="Miercoles";
                break;
                case 4:
                nombredia="Jueves";
                break;
                case 5:
                nombredia="Viernes";
                break;
                case 6:
                nombredia="Sabado";
                break;
                case 7:
                nombredia="Domingo";
                break;
                
            default:
                nombredia="No existe";
                break;
        }
        System.out.println("Tu dia numero "+dia+" corresponde al numero "+nombredia);
    }
    
}