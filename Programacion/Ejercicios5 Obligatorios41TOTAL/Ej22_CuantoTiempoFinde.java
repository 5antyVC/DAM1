    
/*/ 
Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.

*/
import java.util.Scanner;

public class Ej22_CuantoTiempoFinde {
    public static void main(String[] args) {

        int dia,hora,min,max,restante;
        max = 6660;
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca que día es (1-5): ");
        dia = s.nextInt();
        System.out.print("Ahora introduzca que hora es: ");
        hora = s.nextInt();
        System.out.print("Por último introduzca los minutos: ");
        min = s.nextInt();

        restante = (1440*(dia-1)+60*hora+min);

        System.out.println("Faltan " + (max-restante) + " minutos para que sean las 15 del viernes.");
        s.close();

        
    }

}
