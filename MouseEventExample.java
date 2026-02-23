import java.awt.*;
import java.awt.event.*;

public class MouseEventExample implements MouseListener {
    
    Frame f;
    Label l;

    MouseEventExample() {
        f = new Frame("Mouse Event");
        l = new Label("Perform mouse action inside frame");

        f.setSize(350, 300);
        f.setLayout(new FlowLayout());
        f.add(l);
        f.addMouseListener(this);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse is clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse is pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse is released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse is entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse is exited");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}