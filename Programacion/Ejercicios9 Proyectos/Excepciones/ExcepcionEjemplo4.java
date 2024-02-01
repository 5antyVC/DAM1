public class ExcepcionEjemplo4 {

    public static void main(String[] args) {

        try {
            int resultado = dividir(10,0);
            System.out.println("El Resultado es: "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: division entre 0");
        }

    }

    public static int dividir(int a, int b) throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

}
