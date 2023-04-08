/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.io.*;

public class Employee {
    
    private JLabel n;
    private JLabel a;
    private JLabel s;
    private JLabel d;
    private JButton button;
    private JTextField t1,t2,t3,t4;

    
    Employee(){
        JFrame f = new JFrame("Enter Employee");
        
        n = new JLabel("Name");
        a = new JLabel("Address");
        d = new JLabel("Department");
        s = new JLabel("Salary");
        
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);
        
        button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String name = t1.getText();
                String address = t2.getText();
                String dept = t3.getText();
                String salary = t4.getText();
            
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                
                    String q = "insert into employee(name, address, department, salary) values(?,?,?,?)";
                    PreparedStatement pstmt = conn.prepareStatement(q);
                
                    pstmt.setString(1,name);
                    pstmt.setString(2,address);
                    pstmt.setString(3,dept);
                    pstmt.setString(4,salary);
                
                    pstmt.executeUpdate();
             
                    JOptionPane.showMessageDialog(null,"Value Inserted");
                
                    conn.close();
                }catch(Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error inserting employee data: " + e.getMessage());
                }
            }
        });
        
        

        f.add(n);
        f.add(t1);
        f.add(a);
        f.add(t2);
        f.add(d);
        f.add(t3);
        f.add(s);
        f.add(t4);
        f.add(button);
        
        
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,80,10);
        
        
        f.setLayout(fl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);    
        f.setVisible(true);
    
        
    
    }  
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Employee();
    }
    
}
