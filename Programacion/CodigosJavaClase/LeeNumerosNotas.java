public class LeeNumerosNotas {
    public static void main(String[] args) {

        
        String linea, notaTexto ;

        notaTexto="";

        System.out.println("Por favor, introduce una nota:");
        linea=System.console().readLine();

        int nota;
        nota=Integer.parseInt(linea);

        if (nota>0 && nota<5) {
            
            notaTexto="Suspenso";
        }
        else if (nota==5) {

            notaTexto="Suficiente";

        } else if (nota==5) {
            notaTexto="Bien";

        }else if (nota==7 || nota==8) {

            notaTexto="Notable";

        }else if (nota==9) {

            notaTexto="Sobresaliente";
        }else if (nota==10) {

            notaTexto="Matricula de honor";
        }
            
        

        System.out.println("Su nota es "+notaTexto);
    }
}
