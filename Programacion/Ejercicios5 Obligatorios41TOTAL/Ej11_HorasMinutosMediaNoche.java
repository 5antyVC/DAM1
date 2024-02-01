/*
Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
*/

public class Ej11_HorasMinutosMediaNoche  {
    public static void main(String[] args) {


        System.out.println("Por favor, introduzca su hora: ");
        int A;
        A = Integer.parseInt(System.console().readLine());

        if ((A<0) || (A>23)) {
            
            System.out.println("Por favor, introduzca una hora correcta: ");
            A = Integer.parseInt(System.console().readLine());

        }

        System.out.println("Por favor, introduzca su minuto: ");
        int B = Integer.parseInt(System.console().readLine());

        if ((B<0) || (B>60)) {
            
            System.out.println("Por favor, introduzca un minuto correcto: ");
            B = Integer.parseInt(System.console().readLine());

        }
        int suma=(A*3600)+(B*60);
        System.out.println("Su hora es "+A+":"+B);

        System.out.println("Sus horas y minutos en segundos son "+suma+"s");

        int dia =86400;
        int resta =dia-suma;

        System.out.println("Faltan "+resta+"s para media noche");

    }
    
}