package projetGraphique.PackGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DevineNombre extends JFrame {
    private int nombre, tentative;
    private int plusGrand, plusPetit;
    private JTextField entreeTentative;
    private JTextField message;
    private JLabel texte1, texte2, texte3;
    private JButton nouveauJeu;
    public DevineNombre(){
        super( "Cherche nombre" );
        texte1 = new JLabel( "J'ai un nombre compris entre 1 et 1000." );
        texte2 = new JLabel( "Pouvez-vous le deviner? ");
        texte3 = new JLabel( "Votre premier essai:" );
        plusGrand = 0;
        plusPetit = 1000;
        entreeTentative = new JTextField( 5 );
        entreeTentative.addActionListener( new GestionnaireEssai( ) );
        message = new JTextField( "<------------------", 15 );
        message.setEditable( false );
        nouveauJeu = new JButton( "Nouvelle partie" );
        
        nouveauJeu.addActionListener(
        new ActionListener() {
            public void actionPerformed( ActionEvent e ) {
                message.setText( "<------------------" );
                entreeTentative.setText( "" );
                entreeTentative.setEditable( true );
                leJeu();
            }
        }
        );
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        c.add( texte1 );
        c.add( texte2 );
        c.add( texte3 );
        c.add( entreeTentative );
        c.add( message );
        c.add( nouveauJeu );
        setSize( 300, 200 );
        show();
        leJeu();
    }

    public void leJeu() {
        nombre = ( int ) ( Math.random() * 1000 + 1 );
    }
    public static void main( String args[] ) {
        DevineNombre app = new DevineNombre();
        app.addWindowListener(
            new WindowAdapter() {
                public void windowClosing( WindowEvent e ) {
                    System.exit( 0 );
                }
            }
        );
    }
    class GestionnaireEssai implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Container g = getContentPane();
            tentative = Integer.parseInt( entreeTentative.getText() );
            if ( tentative > nombre ) {
                message.setText( "Trop haut" );
                if ( tentative < plusPetit ) {
                    plusPetit = tentative;
                    g.setBackground( Color.red );
                    // Plus chaud.
                } else
                    g.setBackground( Color.blue );
                    // Plus froid.
            } else if ( tentative < nombre ) {
                message.setText( "Trop bas" );
                if ( tentative > plusGrand ) {
                    plusGrand = tentative;
                    g.setBackground( Color.red );
                    // Plus chaud.
                } else setBackground( Color.blue );
                // Plus froid.
            } else {
                message.setText( "Correct!" );
                g.setBackground( Color.white );
                entreeTentative.setEditable( false );
                plusPetit = 1000;
                plusGrand = 0;
            }
        repaint();
        }
    }
}