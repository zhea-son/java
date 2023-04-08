import java.io.*;
import java.net.*;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client");
            DatagramSocket socket = new DatagramSocket(9806);
            
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            
            socket.receive(packet);
            System.out.println("Packets Received");
            
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);
            
            InetAddress clientAddress = packet.getAddress();
            int clientPort = packet.getPort();
            
            byte[] response = ("Server says: " + message).getBytes();
            DatagramPacket responsePacket = new DatagramPacket(response, response.length, clientAddress, clientPort);
            socket.send(responsePacket);
            
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
