
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PalindromeForm extends JFrame{
    
    private JLabel n, p;
    private JButton button;
    private JTextField num, palindrome;
    
    public PalindromeForm(){
        setTitle("Palindrome");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        n = new JLabel("Enter Number:");
        p = new JLabel("Palindrome is:");
        num = new JTextField(20);
        palindrome = new JTextField(20);
        button = new JButton("PALINDROME");
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                int r,sum=0;
                try{
                    String str = num.getText();
                    int number = Integer.parseInt(str);
                    while(number>0){
                        r = number%10;
                        sum = (sum*10)+r;
                        r = r/10;
                    }
                    palindrome.setText(Integer.toString(sum));
                }catch(NumberFormatException e)
                {
                    palindrome.setText("Error");
                }
                
            }
           

            
        });
        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(n);
        panel.add(num);
        panel.add(button);
        panel.add(new JLabel());
        panel.add(p);
        panel.add(palindrome);

        add(panel);
        getContentPane().add(panel);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        new PalindromeForm();
    }
    
}
