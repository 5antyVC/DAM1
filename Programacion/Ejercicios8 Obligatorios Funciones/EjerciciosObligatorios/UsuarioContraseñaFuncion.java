
import javax.swing.*;

public class UsuarioContraseñaFuncion {
    String username, password;

    public static void main(String[] args) {

        UsuarioContraseñaFuncion USUARIO = new UsuarioContraseñaFuncion();
        UsuarioContraseñaFuncion CONTRASEÑA = new UsuarioContraseñaFuncion();

        USUARIO.Usuario();
        CONTRASEÑA.Contraseña();
        do {
            System.out.println("Error, Su contraseña es igual que usuario");
            CONTRASEÑA.Contraseña();

        } while (CONTRASEÑA.password.equals(USUARIO.username));

    }

    public void Usuario() {
        do {
            System.out.println("Error, Su usuario es mas largo de 8 caracteres");

            username = JOptionPane.showInputDialog(null, "Introduce tu nombre", "Nombre", -1);
            System.out.println("Su nombre de usuario es " + username);
        } while (username.length() > 8);

    }

    public void Contraseña() {

        password = JOptionPane.showInputDialog(null, "Introduce tu contraseña", "Contraseña", -1);
        System.out.println("Su contraseña de usuario es " + password);

    }
}
