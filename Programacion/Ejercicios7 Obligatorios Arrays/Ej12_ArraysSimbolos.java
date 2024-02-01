public class Ej12_ArraysSimbolos {

    public static void main(String[] args) {

        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        
        for (int i = 0; i < simbolo.length; i++) {//Imprime Indice
            System.out.print("  "+i+"  ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {//Imprime Valores
            System.out.print("| "+simbolo[i] + " |");


            
        }
    }
}
