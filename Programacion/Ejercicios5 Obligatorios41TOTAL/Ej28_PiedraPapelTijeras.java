/*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
Ejemplo 1:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): papel
Empate
Ejemplo 2:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 2
Ejemplo 3:
Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 1
 * 
 */
import javax.swing.JOptionPane;

public class Ej28_PiedraPapelTijeras {

    public static void main(String[] args) {
        String[] options = { "rock", "paper", "scissors" };
        int maquina = 0;
        int persona = 0;


        var selection = JOptionPane.showOptionDialog(null, "Select one:", "Let's play a game!",
                0, 3, null, options, options[0]);

        //elige maquina

        for (int i = 1; i <= 1; i++) {
            System.out.println((int) (Math.random() * 3) + " ");
        //"1 numero aleatorios entre 0 y 2(sin decimales)

            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Machine chose rock!");
                maquina = 1;
            } else if (i == 1) {
                JOptionPane.showMessageDialog(null, "Machine chose paper!");
                maquina = 2;

            } else {
                JOptionPane.showMessageDialog(null, "Machine chose scissor!");
                maquina = 3;

            }
        }

        //elige tu

        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "You chose rock!");
            persona = 1;
        }
        if (selection == 1) {
            JOptionPane.showMessageDialog(null, "You chose paper.");
            persona = 2;
        }
        if (selection == 2) {
            JOptionPane.showMessageDialog(null, "You chose scissors!");
            persona = 3;

        }

        //resultado
        if (maquina == persona) {
            JOptionPane.showMessageDialog(null, "Draw.");
        } else if (maquina > persona) {
            JOptionPane.showMessageDialog(null, "You lose.");

        } else {
            JOptionPane.showMessageDialog(null, "You win.");

        }

    }
}
