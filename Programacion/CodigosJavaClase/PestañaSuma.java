import javax.swing.JOptionPane;
public class PestañaSuma {
    public static void main (String[] args) {
        int num1 = Integer.parseInt( JOptionPane.showInputDialog(null,
         "Introduzca su primer numero"));
         int num2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Introduzca su segundo numero"));

        int numRes = num1+num2;
        JOptionPane.showMessageDialog(null, "La suma de sus números es " + numRes, "Resultado", 1);
        

    }
}
