/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends JFrame {
    public JTextField input, output;
    
    Buttons(){
        input = new JTextField(15);
        output = new JTextField(15);
        
        JLabel l1 = new JLabel("Enter String");
        JLabel l2 = new JLabel("Output");
        
        JButton palindrome = new JButton("Check Palindrome");
        JButton reverse = new JButton("Reverse");
        JButton vowel = new JButton("Check Vowels");
        
        add(l1);
        add(input);
        add(l2);
        add(output);
        add(palindrome);
        add(reverse);
        add(vowel);
        
        palindrome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               String reverse = "";
                String in = input.getText();
                int len = in.length();
                for(int i = len-1; i>=0; i--){
                    reverse = reverse + in.charAt(i);
                }
                if(in.equalsIgnoreCase(reverse)){
                    output.setText("Palindrome");
                }
                else{
                    output.setText("Not Palindrome");
                }
            }
        });
        
        reverse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String reverse = "";
                String in = input.getText();
                int len = in.length();
                for(int i = len-1; i>=0; i--){
                    reverse = reverse + in.charAt(i);
                }
                output.setText(reverse);
                
            }
        });
        
        vowel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                char[] vow = {'a','e','i','o','u'};
                String in = input.getText();
                int len = in.length();
                int count =0;
                for(int i =0 ; i<=len-1 ; i++){
                    for(int j=0;  j <= vow.length-1 ; j++){
                        if(in.charAt(i) == (vow[j])){
                            count++;
                        }
                    }
                }
                output.setText("There are "+Integer.toString(count)+" Vowels.");
            }
        });
        
        setTitle("Buttons Example");
        setSize(250,250);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Buttons();
    }
    
}
