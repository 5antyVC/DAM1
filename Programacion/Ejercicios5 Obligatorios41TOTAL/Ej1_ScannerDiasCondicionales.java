/*
 * 
Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
*/


import java.util.Scanner;
		
public class Ej1_ScannerDiasCondicionales {
  public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
		
	System.out.print("introduce el dia de la semana:  ");
	String dia =s.nextLine();
	
	
		
		
		if (dia.equals("lunes")) {
			
			System.out.println("Programacion");}
	
		else if (dia.equals("martes")) {
			System.out.println("Base de datos");}
			
		else if (dia.equals("miercoles")) {
			System.out.println("Fol");}
			
		else if (dia.equals("jueves")) {
			System.out.println("Lenguaje de marcado");}
			
			
		else if (dia.equals("viernes")) {
			System.out.println("Entorno");}
			
			
		else {
			System.out.println("Sistemas");}
		
		}


}




