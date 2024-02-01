/*
 * 
Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
*/


import java.util.Scanner;
		
public class Ejercicio1 {
  public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
		
	System.out.print("introduce el dia de la semana:  ");
	String dia =s.nextLine();
	
	
		
		
		if (dia.equals("lunes")) {
			
			System.out.println("programacion");}
	
		else if (dia.equals("martes")) {
			System.out.println("asignatura super divertida");}
			
		else if (dia.equals("miercoles")) {
			System.out.println("dia de procrastinacion");}
			
		else if (dia.equals("jueves")) {
			System.out.println("matematicas");}
			
			
		else if (dia.equals("viernes")) {
			System.out.println("fol");}
			
			
		else {
			System.out.println("dia de cerveza");}
		
		}


}




