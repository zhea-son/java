
package jdbc_management;

import java.awt.Image;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.imageio.ImageIO;

public class helper {
    public static ImageIcon getImageIconById(int id, Connection con){
        ImageIcon icon = null;
        
        try {
            String q = "select pic from images where id=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,id);
            ResultSet set = pstmt.executeQuery();
            if(set.next()){
                Blob b = set.getBlob("pic");
                InputStream is = b.getBinaryStream();
                Image image = ImageIO.read(is);
                icon = new ImageIcon(image);
            }
            return icon;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return icon;
    }
}
