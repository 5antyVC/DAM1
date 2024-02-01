public class Array05 {
    public static void main(String[] args) {

        String asignaturas[] = { "FOL", "Entornos", "Sistemas informáticos", "Lenguaje Marcas", "Programación","Base de Datos" };
        double notas[] = { 8, 8.1, 9.9, 10, 9.01,10 };


        for (int i = 0; i < 6; i++) {
            System.out.println("Nota "+asignaturas[i]+" = "+notas[i]);
        }
    }
}

