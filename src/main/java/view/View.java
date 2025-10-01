package view;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class View {

    public void start(){
        JFrame window = new JFrame("JEvent Manager");

        window.setSize(500,300);

        JPanel panel = new JPanel();
        panel.setSize(300, 300);

        panel.setLayout(new GridBagLayout());

        JLabel label = new JLabel();
        label.setText("Test");

        JTextArea textArea = new JTextArea(1, 20);

        panel.add(label);
        panel.add(textArea);

        window.add(panel);

        window.setVisible(true);
    }


}