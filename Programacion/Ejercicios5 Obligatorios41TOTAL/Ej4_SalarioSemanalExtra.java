/*
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
*/

public class Ej4_SalarioSemanalExtra {
    
    public static void main (String[] args) {

        
		String linea;
		
		System.out.println("Por favor, introduce sus horas trabajadas a la semana : ");
		linea=System.console().readLine();
		double horas;
		horas= Integer.parseInt(linea);
        

        if (horas<40) {
            System.out.println("Su salario semanal contando con 12 euros la hora es :"+ horas*12);

        }
        else
        {
            System.out.println("Su salario semanal EXTRA contando con 16 euros la hora es :"+ (horas*12)+4);


        }
    }
}
