import javax.swing.*;
public class CajaBlanca {

    public static void main(String[] args) {

        String username;
        String[] option = { "Login", "Register" };
        var select = JOptionPane.showOptionDialog(null, "Que desea hacer?", "Inicio", 0, -1, null, option, option);

        if (select == 0) {
            //Usuario
            username = JOptionPane.showInputDialog(null, "Introduce tu nombre", "Nombre", -1);
            System.out.println("Su nombre de usuario es "+username);
            while (username.length() > 10) {//Contraseña mayor a 10 caracteres
                JOptionPane.showConfirmDialog(null, "ERROR, El nombre de usuario no debe tener mas de 10 caracteres", "ERROR", -1, 0);
                username = JOptionPane.showInputDialog(null, "Introduce tu nombre", "Nombre", -1);

            }
            while (username.equals("")) {//Contraseña vacia
                JOptionPane.showConfirmDialog(null, "ERROR, El nombre de usuario no puede estar vacio ", "ERROR,", -1, 0);
                username = JOptionPane.showInputDialog(null, "Introduce tu nombre", "Nombre", -1);
            }
            //Contraseña ***
            JPasswordField pwd = new JPasswordField(10);
             int action = JOptionPane.showConfirmDialog(null, pwd,"Enter password",JOptionPane.OK_CANCEL_OPTION);
            String contra=new String(pwd.getPassword());
            System.out.println("Su contraseña es "+contra);
            while (contra.equals("")) {// Contraseña vacia
                JOptionPane.showConfirmDialog(null, "ERROR, La contraseña no puede estar vacio ", "ERROR,", -1, 0);
                action = JOptionPane.showConfirmDialog(null, pwd,"Enter password",JOptionPane.OK_CANCEL_OPTION);
                 contra=new String(pwd.getPassword());
            }

            while (username.equals(contra)) {// Contraseña igual a usuario
                JOptionPane.showConfirmDialog(null, "ERROR, La contraseña es igual al usuario", "ERROR,", -1, 0);
                action = JOptionPane.showConfirmDialog(null, pwd,"Enter password",JOptionPane.OK_CANCEL_OPTION);
                 contra=new String(pwd.getPassword());
            }

        }

    }
}