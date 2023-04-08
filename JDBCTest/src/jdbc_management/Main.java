
package jdbc_management;

import java.sql.*;
import java.io.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        try {
            
//            System.out.println("this is testing...");

                Connection c = ConnectionProvider.getConnection();
                
//                String q = "create table table1(tId int(20) primary key auto_increment,"
//                 + "tName varchar(200) not null, tCity varchar(400))";
//                
////              PreparedStatement pstmt = c.prepareStatement(q);
//
//                Statement stmt = c.createStatement();
//         
//                stmt.executeUpdate(q);
//         
//                System.out.println("table created in database..");

//                  String q = "insert into table1(tName,tCity) values(?,?)";
//                
//                PreparedStatement pstmt = c.prepareStatement(q);
//                
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                System.out.println("Enter name");
//                String name = br.readLine();
//                
//                System.out.println("Enter city");
//                String city = br.readLine();
//         
//                pstmt.setString(1,name);
//                pstmt.setString(2,city);

                  String q = "insert into images(pic) values(?)";
                  
                  PreparedStatement pstmt = c.prepareStatement(q);
                  
                  JFileChooser jfc = new JFileChooser();
                  jfc.showOpenDialog(null);
                  File file = jfc.getSelectedFile();
                  
                  FileInputStream fis = new FileInputStream(file);
                 
                  
                  
                  pstmt.setBinaryStream(1, fis, fis.available());
                

                pstmt.executeUpdate();
//                System.out.println("values inserted in table..");
                
                JOptionPane.showMessageDialog(null,"Success");
         
                c.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
