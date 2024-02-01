/*
Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos)
*/
public class Ej41_RangoVariacionMayorMenor {
    public static void main(String[] args) {

        System.out.print("Por favor, introduce tu primer numero : ");
        int A = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduce tu segundo numero: ");
        int B = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduce tu tercer: ");
        int C = Integer.parseInt(System.console().readLine());

      

        if (A>=B &&  B>=C) {
            System.out.println("El rango de variacion de A y B es "+(A-B)+" de B y C es"+(B-C)+" de B y C es "+(A-C));
            System.out.println(""+A+","+B+","+C);
        }
            else if (A>=C && A>=B) {
                System.out.println("El rango de variacion de A y B es "+(A-B)+" de B y C es"+(B-C)+" de B y C es "+(A-C));

                System.out.println(""+A+","+C+","+B);

            }
            else if (B>=A && A>=C) {
                System.out.println("El rango de variacion de A y B es "+(A-B)+" de B y C es"+(B-C)+" de B y C es "+(A-C));

                System.out.println(""+B+","+C+","+A);

            }
            else if (B>=C && C>=A) {
                System.out.println("El rango de variacion de A y B es "+(A-B)+" de B y C es"+(B-C)+" de B y C es "+(A-C));

                System.out.println(""+B+","+A+","+C);

            }
            
            else if (C>=A && A>=B) {
                System.out.println("El rango de variacion de A y B es "+(A-B)+" de B y C es"+(B-C)+" de B y C es "+(A-C));

                System.out.println(""+C+","+A+","+B);

            }
        
        else{
            System.out.println("El rango de variacion de A y B es "+(A-B)+" de B y C es"+(B-C)+" de B y C es "+(A-C));

            System.out.println(""+C+","+B+","+A);

        }

       
    }

}