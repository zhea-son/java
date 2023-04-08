/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;


public class NewClass extends KeyAdapter {
    JFrame f ;
    NewClass(){
        f = new JFrame();
        JLabel l1= new JLabel("Number 1");
        JLabel l2= new JLabel("Number 2");
        JLabel l3= new JLabel("Press any key");
        JLabel s= new JLabel("Sum");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JTextField tf4 = new JTextField();
        
        tf3.addKeyListener(new KeyAdapter(){
             public void keyPressed(KeyEvent e){
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            
            
            int sum = n1+n2;
            
            tf4.setText(Integer.toString(sum));
        }
        });
        
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3 );
        f.add(s);
        f.add(tf4);
        
        f.setSize(350,250);
        f.setLayout(new GridLayout(4,2));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        
        public static void main(String[] args) {
        new NewClass();
    }
    }

