

import javax.swing.JOptionPane;

public class PestanaNombre {
    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog(null, "Type your name please");
        JOptionPane.showMessageDialog(null, "Hola" + name);
    }
}