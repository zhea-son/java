/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import java.awt.*;
import javax.swing.*;
public class Flow {
    JFrame f;
    
    Flow(){
        f = new JFrame("FlowLayout");
        
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        

        f.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);    
        f.setVisible(true);
    
}
}
