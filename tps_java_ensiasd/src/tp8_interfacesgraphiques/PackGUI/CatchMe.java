package projetGraphique.PackGUI;
//Filename: CatchMe.java
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class CatchMe extends JFrame {
    JPanel playPanel;
    JButton wildButton;
    Point placement;
    public static void main(String args[]) {
        new CatchMe();
    }
    CatchMe() {
        setTitle("Essayez de cliquer sur le bouton");
        playPanel = new JPanel();
        wildButton = new JButton("attrapez-moi");
        Container c = getContentPane();
        c.add(playPanel, BorderLayout.CENTER);
        playPanel.setLayout(null);
        playPanel.add(wildButton);
        setSize(400, 300);
        show();
        Dimension buttonSize = wildButton.getPreferredSize();
        wildButton.setSize(buttonSize);
        placeButton();
        playPanel.addMouseMotionListener(new ButtonMover());
        wildButton.addActionListener(new CaughtListener());
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );
    }
    class ButtonMover extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent mouseEvent) {
            int xd = Math.abs(placement.x - mouseEvent.getX());
            int yd = Math.abs(placement.y - mouseEvent.getY());
            Dimension buttonSize = wildButton.getSize();
            if ((xd < buttonSize.width) && (yd < buttonSize.height))
                placeButton();
        }
    }
    class CaughtListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wildButton.setText("Félicitations!");
            wildButton.setSize(wildButton.getPreferredSize());
            placeButton();
        }
    }
    void placeButton() {
        Dimension playRegion = playPanel.getSize();
        Dimension buttonSize = wildButton.getSize();
        int xSpan = playRegion.width - buttonSize.width;
        int ySpan = playRegion.height - buttonSize.height;
        int x = (int) (Math.random() * xSpan);
        int y = (int) (Math.random() * ySpan);
        wildButton.setLocation(x, y);
        playPanel.repaint();
        placement = new Point(x + buttonSize.width/2, y + buttonSize.height/2);
    }
}