package interface2;

/**
 * Calculadora
 */
public class Calculadora implements Operaciones {

   @Override
   public int sumar(int a, int b) {

      return a + b;
   }

   @Override
   public int restar(int a, int b) {

      return a - b;
   }

   @Override
   public int multiplicacion(int a, int b) {

      return a * b;
   }

   @Override
   public int division(int a, int b) {

      return a / b;
   }

   @Override
   public double potencia(int  a) {
      double x = Math.pow(a, 2);
      return (int) x;
   }
   @Override
   public double raiz(int  a) {
      double x = Math.sqrt(a);
      return (int) x;
   }
}