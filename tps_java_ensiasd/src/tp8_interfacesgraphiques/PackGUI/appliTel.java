package projetGraphique.PackGUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    public class appliTel extends JFrame {
        JTextField tf;
        public appliTel(int l, int h, String titre) {
            setSize(l,h);
            setTitle(titre);
            addWindowListener(new WindowAdapter () {
                public void windowClosing (WindowEvent e) {System.exit(0);}
            });
        }
        public static void main(String args[]) {
            appliTel ref = new appliTel(250,350,"Un cadran téléphonique");
            ref.affiche();
            ref.pack();
            ref.show();
        }
        void affiche() {
            tf = new JTextField(" ", 25);
            tf.setEditable(false);
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            c.add("North", tf);
            Cadran cadran = new Cadran(tf);
            c.add("Center", cadran);
        }
    }
class Cadran extends JPanel implements ActionListener {
    JTextField le_tf;
    JButton buttons[] = new JButton[12];
    String chaine;
    Cadran(JTextField tf) {
        le_tf = tf;
        super.setLayout(new GridLayout(4,3));
        super.add(buttons[0] = new JButton("0"));
        buttons[0].addActionListener(this);
        super.add(buttons[1] = new JButton("1"));
        buttons[1].addActionListener(this);
        super.add(buttons[2] = new JButton("2"));
        buttons[2].addActionListener(this);
        super.add(buttons[3] = new JButton("3"));
        buttons[3].addActionListener(this);
        super.add(buttons[4] = new JButton("4"));
        buttons[4].addActionListener(this);
        super.add(buttons[5] = new JButton("5"));
        buttons[5].addActionListener(this);
        super.add(buttons[6] = new JButton("6"));
        buttons[6].addActionListener(this);
        super.add(buttons[7] = new JButton("7"));
        buttons[7].addActionListener(this);
        super.add(buttons[8] = new JButton("8"));
        buttons[8].addActionListener(this);
        super.add(buttons[9] = new JButton("9"));
        buttons[9].addActionListener(this);
        super.add(buttons[10] = new JButton("Bis"));
        buttons[10].addActionListener(this);
        super.add(buttons[11] = new JButton("Reset"));
        buttons[11].addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == buttons[11])
            le_tf.setText(" ");
        else if (obj == buttons[10])
            le_tf.setText(chaine);
        else {
            chaine = le_tf.getText() + e.getActionCommand();
            le_tf.setText(chaine);
        }
    }
}