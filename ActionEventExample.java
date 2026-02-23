import java.awt.*;
import java.awt.event.*;

public class ActionEventExample implements ActionListener {

    Frame f;
    Button b;

    ActionEventExample() {
        f = new Frame("Action Listener");
        b = new Button("Click Here");

        f.setLayout(new FlowLayout());
        f.add(b);

        b.addActionListener(this);

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Action is Listened");
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}