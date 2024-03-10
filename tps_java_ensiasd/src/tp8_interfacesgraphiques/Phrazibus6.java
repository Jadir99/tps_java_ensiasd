package projetGraphique;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    public class Phrazibus6 extends JFrame implements ActionListener {
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
    // et de quelques variables d'etat
    private boolean aUnSujet,aUnVerbe;
    private int nbMots;
    private final int indiceDebutSujet,indiceDebutVerbe;
    private final int indiceDebutCod,indiceFinCod;

    Phrazibus6 (int l,int h, String titre) {
        setSize(l,h);
        setTitle(titre);
        initEtat();
    // le Layout par defaut des Frames est un FlowLayout
        setLayout(new FlowLayout());
    // remplissage des panels
    // note: le Layout par defaut des panels est FlowLayout
        for (int i=indiceDebutSujet=0; i<Sujet.length; i++) {
            boutons[nbBoutons] = new JButton(Sujet[i]);
            panelSujet.add(boutons[nbBoutons]);
            boutons[nbBoutons].addActionListener(this);
            nbBoutons++;
        }
        indiceDebutVerbe = nbBoutons;

        for (int i=0; i<Verbes.length; i++) {
            panelVerbes.add(boutons[nbBoutons]=new JButton(Verbes[i]));
            boutons[nbBoutons++].addActionListener(this);
        }
        indiceDebutCod = nbBoutons;
        for (int i=0; i<Cod.length; i++) {
            panelCod.add(boutons[nbBoutons]=new JButton(Cod[i]));
            boutons[nbBoutons++].addActionListener(this);
        }
        indiceFinCod = nbBoutons;
        panelPhrase.add(new JLabel("Phrase:"));
        panelPhrase.add(texte = new JTextField(30));
    // on ne peut plus écrire directement dans la zone de texte
        texte.setEnabled(false);
        texte.setDisabledTextColor(Color.black); // gris sinon.
        panelNouvelle.add(boutons[nbBoutons]=
        new JButton("Nouvelle phrase"));
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
        if (obj == boutons[nbBoutons-1]) {
            texte.setText("");
            initEtat();
        }else
            if (nbMots < 3) {// premiere contrainte
            if (aUnSujet && aUnVerbe && estUnCod(obj)) {
                texte.setText(texte.getText()+ " " + evt.getActionCommand());
                nbMots++;
            }else
                if (aUnSujet && (!aUnVerbe) && estUnVerbe(obj)) {
                    texte.setText(texte.getText()+ " " + evt.getActionCommand());
                    nbMots++;
                    aUnVerbe = true;
                }else
                    if ((!aUnSujet) && estUnSujet(obj)) {
                        texte.setText(texte.getText()+ " " + evt.getActionCommand());
                        nbMots++;
                        aUnSujet = true;
                    }
            }
    }
    private boolean estUnSujet(Object obj) {
        for (int i = indiceDebutSujet; i<indiceDebutVerbe; i++)
            if (obj == boutons[i]) return true;
                return false;
    }
    private boolean estUnVerbe(Object obj) {
        for (int i = indiceDebutVerbe; i<indiceDebutCod; i++)
            if (obj == boutons[i]) return true;
                return false;
    }
    private boolean estUnCod(Object obj) {
        for (int i = indiceDebutCod; i<indiceFinCod; i++)
            if (obj == boutons[i]) return true;
                return false;
        }
    private void initEtat() {
        aUnSujet = aUnVerbe = false;
        nbMots = 0;
    }
    public static void main(String[] args) {
        new Phrazibus6(450,230,"Phrazibus 7");
    }
}