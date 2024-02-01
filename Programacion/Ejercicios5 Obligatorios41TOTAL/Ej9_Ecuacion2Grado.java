/*
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).
*/

public class Ej9_Ecuacion2Grado{
    public static void main(String[] args) {
      
        System.out.println("Por favor, introduce A: ");
        double A = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, introduce B: ");
        double B = Integer.parseInt(System.console().readLine());


        System.out.println("Por favor, introduce C: ");
        double C = Integer.parseInt(System.console().readLine());


        System.out.println("Su ecuacion quedaria asi " + A + "X² + " + B+"X + "+C);


        double D=B*B-4*A*B;

        if (D>0) {
            double r1=(-B+D)/2*A;
            double r2=(-B-D)/2*A;
            System.out.println("Las raices de su ecuacion son X1:"+r1+" y X2:"+r2);
        }
        else if (D==0) {
            double r1=(-B/2*A);

        }
        else
        {
            System.out.println("Su ecuacion no tiene soluciones reales") ;


        }
        
    }
}
