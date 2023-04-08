/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.*;
import java.io.*;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            DatagramSocket socket = new DatagramSocket();
            
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9806;
            
            System.out.println("Enter a string:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String message = reader.readLine();
            byte[] buffer = message.getBytes();
            
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, serverPort);
            socket.send(packet);
            System.out.println("Message sent");
            
            byte[] responseBuffer = new byte[1024];
            DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
            socket.receive(responsePacket);
            
            String responseMessage = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Received response: " + responseMessage);
            
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
