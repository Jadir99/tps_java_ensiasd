    package projetGraphique.HELLO;
    import java.awt.*;
    import java.awt.event.*;
    import java.applet.*;
    import javax.swing.*;

    public class Pong extends Applet implements ActionListener,MouseMotionListener{
        private Timer timer; // générateur d'événements réguliers
        private int maxX,maxY; // dimensions de l'applet
        private int x,y, dx,dy,diametre,rayon; // pour la balle
        private boolean balleVisible;
        private int px,py,pLong,pLong2,pHaut; // pour la palette
        private Button b;
        private Toolkit tk;
        
        public void init() {
            timer = new Timer(10,this);     // un ActionEvent à chaque 10 millisecondes
            timer.stop();
            maxX = getSize().width; maxY = getSize().height;     // dimensions de l'applet
            x = maxX/2; y = maxY/2;         // balle
            dx=1; dy=1;
            rayon=25;
            diametre=2*rayon;
            balleVisible=true;
            pHaut = 15;            // palette

            pLong = diametre;
            pLong2=pLong/2;
            py = maxY-pHaut;
            px = maxX-pLong2;
            b=new Button("lancer");            // bouton
            add(b);
            b.addActionListener(this);
            addMouseMotionListener(this);
            tk = getToolkit();
        }
        // affichage du contenu de l'écran
        public void paint (Graphics g) {
            g.setPaintMode();
            maxX=getSize().width; // dimensions de l'applet
            maxY=getSize().height;
            if(balleVisible){ // la balle
                g.fillOval(x-rayon,y-rayon,diametre,diametre);
                g.drawString(dx+","+dy,10,15);
            }
            py = maxY-pHaut; // la palette
            g.fillRect(px-pLong2,py,pLong,pHaut);
        }
        private void bip(){
            tk.beep();
        }
        // traitement des Action Events (soit du Timer ou du bouton)
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b){ // action sur le bouton
                if(timer.isRunning()){ // arrêter
                    timer.stop();
                    b.setLabel("lancer");
                } else { // relance une nouvelle balle
                    balleVisible=true;
                    x = maxX/2; y = diametre;
                    dx=1; dy=1;
                    timer.start();
                    b.setLabel("arreter");
                }
            } else { // action du Timer
                x += dx; y+=dy; // mise à jour de la position
                // vérification d'un changement de direction (avec accélération...)
                System.out.println("Action => x : " + x + " ; y : " + y);
                if(x<rayon || x>= maxX-rayon){ // frappe un coté
                    dx = dx>0 ? -(++dx) : -(--dx);
                    bip();
                } else if(y<rayon){ // frappe en haut
                    dy = dy>0 ? -(++dy) : -(--dy);
                    bip();
                } else if(y >= maxY-rayon){ // frappe en bas
                    if(x>=px-pLong2-rayon && x<=px+pLong2+rayon){
                        dy = dy>0 ? -(++dy) : -(--dy); //oui
                        bip();
                    } else { // non
                        balleVisible=false; // efface la balle
                        b.setLabel("lancer");
                        timer.stop();
                    }   }   }
            repaint();
        }
        public void mouseDragged(MouseEvent ev){}// traite les déplacements de souris
        public void mouseMoved(MouseEvent ev){ // ignore
            // deplace x en s'assurant qu'on reste dans les bornes de l'applet
            px = Math.min(maxX-pLong2,Math.max(ev.getX(),pLong2));
            repaint();
        }
    }