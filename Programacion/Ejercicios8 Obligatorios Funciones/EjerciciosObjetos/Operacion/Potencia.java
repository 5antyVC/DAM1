package Operacion;
public class Potencia extends Operacion{
    void operar() {
        double Potencia=Math.pow(valor1, valor2);
        resultado=(int) Potencia;
    }
}
