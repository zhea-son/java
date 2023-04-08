import java.net.*;
import java.io.*;

public class ReadURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com/");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}