package projetGraphique.PackGUI;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
public class TestJRadioButton extends JFrame {
    public static void main(String args[]) {
        TestJRadioButton app = new TestJRadioButton();
        app.init();
    }
    public void init() {
        this.setTitle("Test radio boutons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(0,1));
        Border border = BorderFactory.createTitledBorder("Sélection");
        panel.setBorder(border);
        ButtonGroup group = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("Choix 1", true);
        JRadioButton radio2 = new JRadioButton("Choix 2");
        JRadioButton radio3 = new JRadioButton("Choix 3");
        group.add(radio1);
        panel.add(radio1);
        group.add(radio2);
        panel.add(radio2);
        group.add(radio3);
        panel.add(radio3);
        Container contentPane = this.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        this.setSize(300, 150);
        this.setVisible(true);
    }
}