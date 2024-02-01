import java.lang.Math;

public class CalculadoraObjeto {
    public static void main(String[] args) {
        //Declaramos un objeto
        CalculadoraObjeto Calculator =new CalculadoraObjeto();
        //Varibales
        int a=2, b=3;
        //Imprimimos las operaciones llamando a las funciones, adjuntandolas al objeto y usando los parametros por argumento
        System.out.println("Suma= "+Calculator.suma(a, b));
        System.out.println("Resta= "+Calculator.resta(a, b));
        System.out.println("Multiplicacion= "+Calculator.multiplicacion(a, b));
        System.out.println("Division= "+Calculator.division(a, b));
        System.out.println("Raiz Cuadrado de a= "+Calculator.raiz(a));
        System.out.println("Raiz Cuadrado de b= "+Calculator.raiz(b));
        System.out.println("Exponente de base "+a+" en "+b+"= "+Calculator.Exponente(a, b));
    }

    //Creamos las funciones y devolvemos el resultado de la operacion 

    public  int suma(int a, int b) {
        return a + b;
    }

    public  int resta(int a, int b) {
        return a - b;
    }

    public  int multiplicacion(int a, int b) {
        return a * b;
    }

    public  int division(int a, int b) {
        return a / b;
    }
    public  double raiz(int a) {
        double raiz=Math.sqrt(a);
        return raiz;
    }

    public  double Exponente(int a, int b) {
        double c=Math.pow(a,  b);
        return c;
    }
}
