public class Ej5_ArrayTemperatura {
    public static void main(String[] args) {
        //array meses
        String[] mes = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        int[] temperatura = new int[12];
        int i;
        for (i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura de " + mes[i] + ": ");
            temperatura[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();

        for (i = 0; i < 12; i++) {
            System.out.printf("%12s " + "│", mes[i]);
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
