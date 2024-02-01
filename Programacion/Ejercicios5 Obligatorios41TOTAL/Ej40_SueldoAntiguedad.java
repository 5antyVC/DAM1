/*De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que lea los datos de entrada e informe:

a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.

b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.

c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 * 
 */
import java.util.Scanner;

public class Ej40_SueldoAntiguedad {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double sueldo=0;
        int años=0;

        System.out.print("Cual es su sueldo?");
        sueldo=s.nextDouble();

        System.out.print("Cuantos años lleva en la empresa?");
        años=s.nextInt();

        if (sueldo<500 && años>=10) {
            sueldo=sueldo+sueldo*0.20;
            System.out.println("Su sueldo se aumenta un 20%: "+sueldo);

        }
        else if (sueldo<500 && años<10) {
            sueldo=sueldo+sueldo*0.05;
            System.out.println("Su sueldo se aumenta un 5%: "+sueldo);

        }
        else{
            System.out.println("Su sueldo se queda igual: "+sueldo);
        }
    }
}