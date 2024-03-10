package projetGraphique.HELLO;
//applet compte le nombre de fois qu'on appuie sur un bouton
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
    
public class Compteur extends Applet implements ActionListener {
// instance variables etc
    private Button piton;
    private int valeur ;
    public void init() {
        valeur = 0;
        piton = new Button("Appuyez ici");
        add(piton);
        piton.addActionListener(this);
    }
    public void paint(Graphics g) {
        g.drawString("Nbre="+valeur,10,50);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == piton)
        valeur++;
        repaint();
    }
}