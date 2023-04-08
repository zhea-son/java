
import java.net.*;
import java.net.Socket;
import java.io.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for Client");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            
            BufferedReader sbr = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = sbr.readLine();
            PrintStream sout = new PrintStream(soc.getOutputStream(),true);
            sout.println("Server says:"+str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
