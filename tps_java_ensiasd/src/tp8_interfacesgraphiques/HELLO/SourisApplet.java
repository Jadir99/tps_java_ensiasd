package projetGraphique.HELLO;
/*
Si MouseMotionListener est implémentée nous devons
définir les deux méthodes mouseDragged et mouseMoved.
mouseDragged:
-------------
bouton de la souris est pressé souris déplacée
public void mouseDragged(MouseEvent e) ...
mouseMoved:
-----------
souris déplacée et le curseur se trouve dans un composant
public void mouseMoved(MouseEvent e) ...
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
    public class SourisApplet extends Applet implements MouseMotionListener {
        Point dernierePositionConnue = null;
        public void init () {
            addMouseMotionListener(this);
        }
        public void paint (Graphics g) {
            g.drawString ("X: " + dernierePositionConnue.x, 50, 40);
            g.drawString ("Y: " + dernierePositionConnue.y, 50, 80);
        }
        public void mouseDragged (MouseEvent evt) {}
        public void mouseMoved (MouseEvent evt) {
            dernierePositionConnue = evt.getPoint();
            repaint();
        }
    }