
package swing;
import java.awt.*;

import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;

public class Group {
    JFrame f;
    
    Group(){
        f = new JFrame("GroupLayout");
        Container cp = f.getContentPane();
        GroupLayout gl = new GroupLayout(cp);
        cp.setLayout(gl);
        
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JLabel l = new JLabel("Click Here");
        
//        gl.setHorizontalGroup(gl.createSequentialGroup()
//                .addGroup(gl.createParallelGroup().addComponent(b1).addComponent(l)) 
//                .addGroup(gl.createParallelGroup().addComponent(b2))   
//        );
//        
//        
//        gl.setVerticalGroup(gl.createSequentialGroup()  
//                .addGroup(gl.createParallelGroup(BASELINE).addComponent(b1).addComponent(b2))  
//                .addGroup(gl.createParallelGroup(BASELINE).addComponent(l)));

           
           gl.setHorizontalGroup(  
                    gl.createSequentialGroup()  
                                .addComponent(l)  
                                .addGap(10, 20, 100)  
                                .addComponent(b1));  
        gl.setVerticalGroup(  
                     gl.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(l)  
                                .addComponent(b1));  

        
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(800, 300);
        f.pack();
        f.setVisible(true);
    }
}
