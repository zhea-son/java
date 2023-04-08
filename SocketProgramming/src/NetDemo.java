import java.net.*;

public class NetDemo {
    public static void main(String[] args) {
        try {
            // Create an InetAddress object representing the local host
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local host name: " + localhost.getHostName());
            System.out.println("Local host address: " + localhost.getHostAddress());
            
            // Create an InetAddress object representing a remote host
            InetAddress remoteHost = InetAddress.getByName("www.example.com");
            System.out.println("Remote host name: " + remoteHost.getHostName());
            System.out.println("Remote host address: " + remoteHost.getHostAddress());
            
            // Create a URL object representing a web page
            URL url = new URL("https://www.example.com/");
            System.out.println("URL protocol: " + url.getProtocol());
            System.out.println("URL host: " + url.getHost());
            System.out.println("URL path: " + url.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}