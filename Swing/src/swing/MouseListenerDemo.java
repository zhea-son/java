package swing;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.event.*;

public class MouseListenerDemo implements MouseListener{
    JFrame f;
    JLabel l;
    MouseListenerDemo(){
        f = new JFrame();
        f.setSize(400,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel();
        l.setBounds(100,100,100,30);
        f.add(l);
        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me){
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent me){
        l.setText("Mouse Pressed");
    }

    public void mouseExited(MouseEvent me){
        l.setText("Mouse Exited");
    }

    public void mouseReleased(MouseEvent me){
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent me){
        l.setText("Mouse Entered");
    }

    public static void main(String[] args) {
        new MouseListenerDemo();
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        l.setText("Mouse Clicked");     
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        l.setText("Mouse Pressed");      
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        l.setText("Mouse Released");     
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        l.setText("Mouse Entered");
   }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        l.setText("Mouse Exited");       
    } 
}