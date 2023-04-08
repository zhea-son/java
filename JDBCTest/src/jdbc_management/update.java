
package jdbc_management;

import java.sql.*;
import java.io.*;

public class update {
    public static void main(String[] args) {
        try {
            
            Connection c = ConnectionProvider.getConnection();
            
            String q = "update table1 set tName=?, tCity=? where tId=?";
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter new name: ");
            String name = br.readLine();
            
            System.out.println("Enter new city: ");
            String city = br.readLine();
            
            System.out.println("Enter the student Id: ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = c.prepareStatement(q);
            
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            System.out.println("Done....");
            
            c.close();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
}
