public class AdivinadorNumero {
    public static void main(String[] args) {

        String linea;
        System.out.println("Por favor, introduce tu numero : ");

        linea = System.console().readLine();

        int Num;
        Num = Integer.parseInt(linea);

        int Adivinado = 27;

        if (Num != Adivinado) {
            System.out.println("Numero erroneo siga intentando");
        }

        else {

            System.out.println("Numero adivinado");
        }

    }
}
