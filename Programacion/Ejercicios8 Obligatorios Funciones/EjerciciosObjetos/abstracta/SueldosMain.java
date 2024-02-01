package abstracta;

public class SueldosMain {

        public static void main(String[] args) {
                // TODO Esbozo de método generado automáticamente
                Sueldos empleado = new Empleado("Juan", "Programador", 5000.0, "enero");
                Sueldos empleado1 = new Empleado("Alberto", "Profesor", 7500.0, "febrero");
                Sueldos becario = new Becario("JuanJR", "Becario", 3000.0, "enero","10 de enero de 2023", "15 de febrero de 2023");

                Sueldos directivo1 = new Directivos("Raquel", "directora", 12000.0, "febrero", 300.0);
                Sueldos directivo2 = new Directivos("Marina", "Coordinadora", 11000.0, "febrero", 200.0);

                System.out.println("El Salario de " + empleado.getNombre() + " es: " +
                                empleado.calcularSalario() + " " + empleado.getMes()
                                + " el irpf es " + empleado.Irpf());
                System.out.println("El Salario de " + empleado1.getNombre()
                                + " es: " + empleado1.calcularSalario() + " " + empleado1.getMes()
                                + " el irpf es " + empleado.Irpf());
                System.out.println("El Salario de " + becario.getNombre()
                                + " es: " + becario.calcularSalario() + " " + becario.getMes()
                                + " el irpf es " + becario.Irpf()+ " practicas: "+becario.fechas());

                System.out.println("El Salario de " + directivo1.getNombre()
                                + " es: " + directivo1.calcularSalario() + " " + directivo1.getMes()
                                + " el irpf es " + directivo1.Irpf() + " el incremento es "
                                + directivo1.MostrarDividendo());

                ((Empleado) empleado).vacaciones();

        }

}