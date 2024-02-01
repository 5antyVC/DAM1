package interface2;
public class OperacionesMain {

    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        System.out.println("La suma es "+ calculadora.sumar(20, 10));
        System.out.println("La resta es "+ calculadora.restar(20, 10));
        System.out.println("La multiplicacion es "+ calculadora.multiplicacion(20, 10));
        System.out.println("La division es "+ calculadora.division(20, 10));
        System.out.println("El cuadrado es "+ calculadora.potencia(2));
        System.out.println("La raiz es "+ calculadora.raiz(2));

    }
}