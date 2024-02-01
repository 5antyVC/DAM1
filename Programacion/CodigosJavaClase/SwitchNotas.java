public class SwitchNotas {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca su nota: ");

        int nota=Integer.parseInt(System.console().readLine());

        String nombrenota;

        switch (nota) {
            case 1, 2, 3, 4:
                nombrenota="Suspenso";
                break;
                case 5:
                nombrenota="Aprobado";
                break;
                case 6:
                nombrenota="Bien";
                break;
                case 7:
                nombrenota="Notable bajo";
                break;
                case 8:
                nombrenota="Notable alto";
                break;
                case 9:
                nombrenota="Sobresaliente";
                break;
                case 10:
                nombrenota="Matricula de honor";
                break;
             
        
        
            default:
                nombrenota="No existe";
                break;
        }
        System.out.println("Tu nota numero "+nota+" corresponde a "+nombrenota);
    }
    
}