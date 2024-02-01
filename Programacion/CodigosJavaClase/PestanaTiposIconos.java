import javax.swing.JOptionPane;

public class PestanaTiposIconos {
    public static void main (String[] args) {
        JOptionPane.showMessageDialog(null, "Mensaje sin icono PLAIN_MESSAGE o -1", null, -1);
        JOptionPane.showMessageDialog(null, "Mensaje con ERROR_MESSAGE o 0", null, 0);
        JOptionPane.showMessageDialog(null, "Mensaje con INFORMATION_MESSAGE o 1", null, 1);
        JOptionPane.showMessageDialog(null, "Mensaje con WARNING_MESSAGE o 2", null, 2);
        JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE o 3", null, 3);
        
    }
}
