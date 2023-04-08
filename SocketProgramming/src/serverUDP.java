/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.*;
import java.io.*;

public class serverUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];
        
        DatagramPacket dpReceive = null;
        
        while(true){
            dpReceive = new DatagramPacket(receive, receive.length);
            
            ds.receive(dpReceive);
            
            System.out.println("Client:- " + data(receive));
            
            if(data(receive).toString().equals("bye")){
                System.out.println("Client says Bye....EXITING");
                break;
            }
            
            receive = new byte[65535];
        }
    }
    
    public static StringBuilder data(byte[] a){
        if(a==null){
            return null;
        }
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while(a[i]!=0){
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
