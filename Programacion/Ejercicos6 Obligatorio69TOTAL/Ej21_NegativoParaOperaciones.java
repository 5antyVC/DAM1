/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.


 */
public class Ej21_NegativoParaOperaciones {
    public static void main(String[] args) {
        
        int n = 0,cuantos=0, sumaImp=0, nImp=0, maxPar=0;
        System.out.print("Introduzca un numero positivo: ");
      
        while (n>=  0) {
        n = Integer.parseInt(System.console().readLine());
       
            if (n>=0) {
                cuantos++;
                if (n%2==1) {
                    sumaImp+=n;
                     nImp++;
    
                }
                else
                {
                    if (n>maxPar) {
                        maxPar=n;
                    }
                }
            }
           
        }
        System.out.println("Ha introducido "+cuantos+" numeros");
       System.out.print("La media de los impares es ");
       System.out.println(sumaImp/nImp);
       System.out.println("El mayor de los pares es "+maxPar);
        

    }

}