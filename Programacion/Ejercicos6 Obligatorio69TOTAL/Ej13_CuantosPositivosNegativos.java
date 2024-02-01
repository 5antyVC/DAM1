/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.


 */
public class Ej13_CuantosPositivosNegativos {
    public static void main(String[] args) {
    
        int np=0, nn=0;
        System.out.print("Introduzca 10 numeros ");

      for (int i = 0; i < 10; i++) {
        int n = Integer.parseInt(System.console().readLine());

            if (n<0) {
                np++;
            }
            else
            {
                nn++;
            }
      }
      System.out.println("Ha introducido "+np+" numeros positivos y "+nn+" negativos");


    }
}
