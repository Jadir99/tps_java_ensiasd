package projetGraphique;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Phrazibus5 extends JFrame implements ActionListener {
    String Sujet[] = {"Ali", "Mohamed", "Khalil", "youssef","Ayoub"};
    String Verbes[] = {"aime", "deteste", "adore"};
    String Cod[] = {"les pommes","le sucre","Jean","le gateau"};
    JPanel panelSujet = new JPanel();
    JPanel panelVerbes = new JPanel();
    JPanel panelCod = new JPanel();
    JPanel panelPhrase = new JPanel();
    JPanel panelNouvelle = new JPanel();
    JButton boutons[] = new JButton [50];
    int nbBoutons = 0;
    private JTextField texte; // une ref sur la phrase

    Phrazibus5 (int l,int h, String titre) {
        setSize(l,h);
        setTitle(titre);
    // le Layout par defaut des Frames est un FlowLayout
        setLayout(new FlowLayout());
    // remplissage des panels
        for (int i=0; i<Sujet.length; i++) {
            boutons[nbBoutons] = new JButton(Sujet[i]);
            panelSujet.add(boutons[nbBoutons]);
            boutons[nbBoutons].addActionListener(this);
            nbBoutons++;
        }
        for (int i=0; i<Verbes.length; i++) {
            panelVerbes.add(boutons[nbBoutons]=new JButton(Verbes[i]));
            boutons[nbBoutons++].addActionListener(this);
        }
        for (int i=0; i<Cod.length; i++) {
            panelCod.add(boutons[nbBoutons]=new JButton(Cod[i]));
            boutons[nbBoutons++].addActionListener(this);
        }
        panelPhrase.add(new JLabel("Phrase:"));
        panelPhrase.add(texte = new JTextField(30));
    // on ne peut plus écrire directement dans la zone de texte
        texte.setEnabled(false);
        texte.setDisabledTextColor(Color.black); // sinon gris!
        panelNouvelle.add(boutons[nbBoutons] =new JButton("Nouvelle phrase"));
        boutons[nbBoutons++].addActionListener(this);
    // il reste encore a ajouter les panels dans la fenetre
        add(panelSujet);
        add(panelVerbes);
        add(panelCod);
        add(panelPhrase);
        add(panelNouvelle);
        setVisible(true);;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent evt) {
        evt.getActionCommand();
        Object obj = evt.getSource();
        if (obj == boutons[nbBoutons-1]) texte.setText("");
        else{
            texte.setText(texte.getText() + " " + evt.getActionCommand());
        }
    }
    public static void main(String[] args) {
        new Phrazibus5(450,230,"Phrazibus 5");
    }
}