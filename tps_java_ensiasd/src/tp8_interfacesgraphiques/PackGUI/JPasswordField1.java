package projetGraphique.PackGUI;
import java.awt.Dimension;
import javax.swing.*;
    public class JPasswordField1 {
        public static void main(String argv[]) {
            JFrame f = new JFrame("ma fenetre");
            f.setSize(300, 100);
            JPanel pannel = new JPanel();
            JPasswordField passwordField1 = new JPasswordField ("");
            passwordField1.setPreferredSize(new Dimension(100,20 ));
            pannel.add(passwordField1);
            f.getContentPane().add(pannel);
            f.setVisible(true);
        }
    }