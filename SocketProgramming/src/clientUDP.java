/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class clientUDP {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        DatagramSocket ds = new DatagramSocket();
        
        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
        
        while(true){
            String inp = sc.nextLine();
            
            buf = inp.getBytes();
            
            DatagramPacket dpSend = new DatagramPacket(buf, buf.length, ip, 1234);
            
            ds.send(dpSend);
            
            if(inp.equals("bye"))
                break;
        }
    }
            
            
    
}
