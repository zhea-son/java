package swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.lang.*;

public class PressandRelease extends MouseAdapter {
    public JFrame f;
    public JTextField tf1,tf2,tf3;

    PressandRelease(){
        f = new JFrame();
        

        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);

        JLabel l1 = new JLabel("Number 1");
        JLabel l2 = new JLabel("Number 2");
        JLabel l3 = new JLabel("Result");

        f.addMouseListener(this);

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        
        f.setSize(350,250);
        f.setLayout(new GridLayout(3,2));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mousePressed(MouseEvent e){
        int n1 = Integer.parseInt(tf1.getText());
        int n2 = Integer.parseInt(tf2.getText());
        tf3.setText("Sum is "+Integer.toString(n1+n2));
    }

    public void mouseReleased(MouseEvent e){
        int n1 = Integer.parseInt(tf1.getText());
        int n2 = Integer.parseInt(tf2.getText());
        tf3.setText("Difference is: "+Integer.toString(n1-n2));
    }

    public static void main(String[] args) {
        new PressandRelease();
    }
}