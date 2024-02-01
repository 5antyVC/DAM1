/*
Escribe un programa que ordene tres números enteros introducidos por teclado.*/

public class Ej13_Ordenar3Numeros {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu primer numero : ");
        int A = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce tu segundo numero: ");
        int B = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce tu tercer: ");
        int C = Integer.parseInt(System.console().readLine());

        if (A>=B &&  B>=C) {

            System.out.println(""+A+","+B+","+C);
        }
            else if (A>=C && A>=B) {
                System.out.println(""+A+","+C+","+B);

            }
            else if (B>=A && A>=C) {
                System.out.println(""+B+","+C+","+A);

            }
            else if (B>=C && C>=A) {
                System.out.println(""+B+","+A+","+C);

            }
            else if (C>=A && A>=B) {
                System.out.println(""+C+","+A+","+B);

            }
        
        else{
            System.out.println(""+C+","+B+","+A);

        }

       
    }

}