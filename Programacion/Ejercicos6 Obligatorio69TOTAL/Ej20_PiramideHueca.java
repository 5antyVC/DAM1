/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.


 */
public class Ej20_PiramideHueca { //Preguntar en clase
    public static void main(String[] args) {

      System.out.print("Altura Pirameide:");
      int hInt =Integer.parseInt(	System.console().readLine());
      System.out.print("Relleno:");
      String r =	System.console().readLine();


      int h=1;
      int i=0;
      int espaciosDelante=hInt-1;
      int espaciosInternos=0;

      while (h<hInt) {
          
          for (i = 1; i <= espaciosDelante; i++) {
              System.out.print(" ");
          }
          
          System.out.print(r);
          for ( i = 1; i < espaciosInternos; i++) {
              System.out.print(" ");

          }

          if (h>1) {
              System.out.print(r);

          }
          System.out.println();
          h++;
          espaciosDelante--;
          espaciosInternos+=2;
          

         
      }
      for (i = 1; i < h*2; i++) {
          System.out.print(r);

      }

    }
}