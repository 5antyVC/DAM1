import java.io.*;
import javax.swing.*;

public class Password {
    public static void main(String[] args) {

        JPasswordField pwd = new JPasswordField(10);
        int action = JOptionPane.showConfirmDialog(null, pwd, "Enter Password", JOptionPane.OK_CANCEL_OPTION);

        if (action < 0){
            JOptionPane.showMessageDialog(null,"Cancel, X or escace key selected");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your password is " + new String(pwd.getPassword()));

            
        }
        System.exit(0);

    }
}