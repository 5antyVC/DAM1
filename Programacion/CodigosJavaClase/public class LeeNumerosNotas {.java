public class SwtichMes {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca un numero de mes: ");

        int mes=Integer.parseInt(System.console().readLine());

        String nombreMes;

        switch (mes) {
            case 1:
                nombreMes="Enero";
                break;
                case 2:
                nombreMes="Febrero";
                break;
                case 3:
                nombreMes="Marzo";
                break;
                case 4:
                nombreMes="Abril";
                break;
                case 5:
                nombreMes="Mayo";
                break;
                case 6:
                nombreMes="Junio";
                break;
                case 7:
                nombreMes="Julio";
                break;
                case 8:
                nombreMes="Agosto";
                break;
                case 9:
                nombreMes="Septiembre";
                break;
                case 10:
                nombreMes="Octubre";
                break;
                case 11:
                nombreMes="Noviembre";
                break;
                case 12:
                nombreMes="Diciembre";
                break;
        
        
            default:
                nombreMes="No hay un mes con ese numero";
                break;
        }
        System.out.println("Tu mes es "+nombreMes+" lo que corresponde al numero "+mes);
    }
    
}