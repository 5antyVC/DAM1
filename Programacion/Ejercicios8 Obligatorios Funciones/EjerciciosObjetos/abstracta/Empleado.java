package abstracta;

public class Empleado extends Sueldos {

    public Empleado(String nombre, String puesto, double salario, String mes) {

        super(nombre, puesto, salario, mes);
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 0.10;
    }

    @Override
    public double calcularIRPF() {
        double salariototal = (getSalario() * 0.10 + getSalario());
        return salariototal * 0.15;
    }

    public void vacaciones() {
        System.out.println("Sus vacaciones son en Agosto");

    }
}