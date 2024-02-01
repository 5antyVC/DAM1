public class NotasMediaFuncion {

    public static void main(String[] args) {
        NotasMediaFuncion nota = new NotasMediaFuncion();

        String asignaturas[] = { "FOL", "Entornos", "Sistemas informáticos", "Lenguaje Marcas", "Programación",
                "Base de Datos" };

        int[] notas = new int[asignaturas.length];

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("Nota de " + asignaturas[i] + " = ");
            notas[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("----------------------------------");
        for (int i = 0; i < asignaturas.length; i++) {

            System.out.print(asignaturas[i] + " = ");
            System.out.println(notas[i]);
        }

        int media = nota.media(notas);
        System.out.println("La media de sus notas es " + media);

    }

    public int media(int[] x) {
        System.out.println("----------------------------------");

        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        System.out.println("La suma de sus notas es: "+ suma);
        System.out.println("Numero de asignaturas: "+x.length);
        return suma / x.length;
    }

}
