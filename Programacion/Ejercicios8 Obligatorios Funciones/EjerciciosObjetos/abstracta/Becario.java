package abstracta;

public class Becario extends Sueldos {
    private String fechaInicio;
	private String fechaFin;
    
    public Becario(String nombre, String puesto, double salario, String mes, String fechaInicio, String fechaFin) {

        super(nombre, puesto, salario, mes);
        this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
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
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        fechaFin = fechaFin;
    }
    @Override
    public String fechas()
    {
        return "Desde "+fechaInicio +" hasta "+fechaFin;
    }

}
