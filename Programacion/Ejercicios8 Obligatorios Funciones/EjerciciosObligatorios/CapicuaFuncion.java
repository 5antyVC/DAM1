public class CapicuaFuncion {
    public static void main(String[] args) {
        int a = 55;
        System.out.println(esCapicua(a));
    }

    public static boolean esCapicua(int x) {
        boolean capicua = false;

        if (x < 10) {

            capicua = true;
        }

        else if ((x >= 10) && (x <= 100)) {
            if ((x / 10) == (x % 10)) {
                capicua = true;

            }
        } else if ((x >= 100) && (x <= 1000)) {
            if ((x / 100) == (x % 10)) {
                capicua = true;
            }
        } else if ((x >= 1000) && (x <= 10000)) {
            if (((x / 1000) == (x % 10)) && (x / 100) % 10 == (x / 10) % 10) {
                capicua = true;

            }
        } else if (x >= 10000) {
            if (((x / 1000) == (x % 10)) && ((x / 10000) % 10) == ((x / 10) % 10)) {
                capicua = true;

            }

        }

        if (capicua) {
            System.out.println("El número introducido es capicúa.");
        } else {
            System.out.println("El número introducido no es capicúa.");
        }
        return capicua;
    }
}
