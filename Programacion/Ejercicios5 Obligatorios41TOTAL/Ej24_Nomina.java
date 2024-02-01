/*Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
Ejemplo:
1 - Programador junior
2 - Prog. senior
3 - Jefe de proyecto
Introduzca el cargo del empleado (1 - 3): 2
¿Cuántos días ha estado de viaje visitando clientes? 5
Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
----------------------------------
| Sueldo base 1200,00 |
| Dietas ( 5 viajes) 150,00 |
|--------------------------------|
| Sueldo bruto 1350,00 |
| Retención IRPF (20%) 270,00 |
|--------------------------------|
| Sueldo neto 1080,00 |
----------------------------------
*/    
import java.util.Scanner;

public class Ej24_Nomina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cargo, viaje=0, estadocivil;
        double IRPF=0;
        int sueldo=0;
        System.out.println("1- Programador Junior 2- Programador Senior 3-Jefe de poryecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        cargo = s.nextInt();
      
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?");
        viaje = s.nextInt();

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadocivil = s.nextInt();


        if (cargo==1) {
            sueldo=950;
            System.out.println("-------------------------------------------");

            System.out.println("Suelo base: "+sueldo);
        }
        else if (cargo==2) {
            sueldo=1200;
            System.out.println("-------------------------------------------");

            System.out.println("Suelo base: "+sueldo);

        }
        else if (cargo==3) {
            sueldo=1600;
            System.out.println("-------------------------------------------");

            System.out.println("Suelo base: "+sueldo);


        }

      if (viaje>=1) {
        sueldo+=viaje*30;
        System.out.println("Dietas("+viaje+" viajes )"+viaje*30);
        System.out.println("-------------------------------------------");

      }

      if (estadocivil==1) {
        IRPF=sueldo-sueldo*0.25;
        System.out.println("Sueldo bruto "+sueldo);
        System.out.println("Retencion de IRPF(25%) "+sueldo*0.25);
        System.out.println("-------------------------------------------");

        System.out.println("Sueldo Neto "+IRPF);
      }
      else if (estadocivil==2) {
        IRPF=sueldo-sueldo*0.20;
        System.out.println("Sueldo bruto "+sueldo);
        System.out.println("Retencion de IRPF(25%) "+sueldo*0.20);
        System.out.println("-------------------------------------------");
        System.out.println("Sueldo Neto "+IRPF);
      }

    }
}