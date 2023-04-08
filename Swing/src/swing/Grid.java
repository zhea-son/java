/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import java.awt.*;
import javax.swing.*;
public class Grid {
    JFrame f;
    Grid(){
        f = new JFrame("Grid Layout");  
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");
        JButton b7 = new JButton("b7");
        JButton b8 = new JButton("b8");
        JButton b9 = new JButton("b9");
        JButton b10 = new JButton("b10");        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);   
        f.setLayout(new GridLayout(3,3,20,25));   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 300);    
        f.setVisible(true);
    }
}
