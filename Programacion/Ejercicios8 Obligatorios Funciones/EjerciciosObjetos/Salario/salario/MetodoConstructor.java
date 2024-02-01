package salario;

import java.util.Scanner;

public class MetodoConstructor {
    private Scanner teclado;
    private int[] sueldos;
    private double IRPF = 0.15;

    public MetodoConstructor() {

        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el valor del sueldo:");
            sueldos[i] = teclado.nextInt();
        }

    }

    public void imprimir() {
        int numero = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Sueldo " + numero + " :" + sueldos[i]);
            numero++;
        }
    }

    public void IRPF() {
        for (int i = 0; i < 5; i++) {
            sueldos[i] *= IRPF;
        }

    }

    public void media() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += sueldos[i];
        }
        System.out.println("La suma de sueldos es " + suma);
        System.out.println("La media es " + suma / sueldos.length);
    }

    public static void main(String[] args) {
        MetodoConstructor operario = new MetodoConstructor();
        operario.imprimir();
        operario.IRPF();
        operario.media();

    }
}