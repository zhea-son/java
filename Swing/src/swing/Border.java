/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import java.awt.*;
import javax.swing.*;

public class Border {
    JFrame f;
    
    Border()  {    
    f = new JFrame("BorderLayout");    
        
     // creating buttons  
    JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH   
    JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH  
    JButton b3 = new JButton("EAST");; // the button will be labeled as EAST  
    JButton b4 = new JButton("WEST");; // the button will be labeled as WEST  
    JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER  
     
    f.setLayout(new BorderLayout(20,15));
    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
//    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
//    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
    f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
        
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300, 300);    
    f.setVisible(true); 
}
   
}
