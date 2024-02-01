/*
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = Sqr(2hg )siengo g=9.81m/s.
*/

import java.lang.Math; 
public class Ej6_Altura {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce la altura(H): ");
        double H = Integer.parseInt(System.console().readLine());
        double todo=(2*H*9.81);
        double t=Math.pow(todo,2);

        System.out.println("Su tiempo de caida es "+  t+"s");


    }
}
