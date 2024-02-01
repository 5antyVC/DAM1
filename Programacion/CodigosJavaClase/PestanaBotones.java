import javax.swing.JOptionPane;
public class PestanaBotones {
    public static void main (String[] args) {
        int PestañaYesNoCancel = JOptionPane.showConfirmDialog(null, "Elige un boton.",
         "Botones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //0=yes 1=no 2=cancel
         if (PestañaYesNoCancel == 0) {
            System.out.println("Has pulsado Yes");
        }
        else if (PestañaYesNoCancel == 1) {
            System.out.println("Has pulsado No");
        } else if (PestañaYesNoCancel == 2) {
            System.out.println("Has pulsado Cancel");
        }
    }
}
