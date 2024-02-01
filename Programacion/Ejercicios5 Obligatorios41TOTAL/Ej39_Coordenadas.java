/*
Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.) */

public class Ej39_Coordenadas {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca su coordenada x(distinto a 0): ");
        int x;
        x = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca su coordenada y(distinto a 0): ");
        int y;
        y = Integer.parseInt(System.console().readLine());
       
        
        if (x>0 && y>0) {
            System.out.println("Primer Cuadrante");
        }
        else if (x<0 && y>0) {
            System.out.println("Segundo Cuadrante");

        }
        else if (x<0 && y<0) {
            System.out.println("Tercer Cuadrante");

        }
        else
        {
            System.out.println("Cuarto Cuadrante");

        }
    
    }

}