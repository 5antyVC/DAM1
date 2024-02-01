
/*/ 
Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.*/
public class Ej32_TipoNumero {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce tu numero : ");
        int A = Integer.parseInt(System.console().readLine());
      
       if (A>0) {
        System.out.println("Su numero "+A+" es positivo");
       }
       else if (A<0) {
        System.out.println("Su numero "+A+" es negativo");

       }
       else 
       {
        System.out.println("Su numero "+A+" es nulo");

       }
    }

}
