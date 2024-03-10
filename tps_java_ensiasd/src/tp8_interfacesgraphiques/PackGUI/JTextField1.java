package projetGraphique.PackGUI;
import javax.swing.*;
import javax.swing.*;
public class JTextField1 {
    public static void main(String argv[]) {
        JFrame f = new JFrame("ma fenetre");
        f.setSize(300, 100);
        JPanel pannel = new JPanel();
        JTextField testField1 = new JTextField ("mon texte");
        pannel.add(testField1);
        f.getContentPane().add(pannel);
        f.setVisible(true);
    }
}