package view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{

    private JPanel contentPane;
    private JTabbedPane tabbedPane;
    private JPanel Main;
    private JPanel Extra;
    private JTable nextInLineTable;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private CardLayout layout;

    public View (){
        setContentPane(this.contentPane);
        setTitle("EventWalker");
        setSize(720, 460);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


}