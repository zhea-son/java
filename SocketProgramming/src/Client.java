import java.io.IOException;
import java.net.Socket;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client Started");
        Socket soc = new Socket("localhost",9806);
        
        System.out.println("Enter a string:");
        BufferedReader cbr = new BufferedReader(new InputStreamReader(System.in));
        String str = cbr.readLine();
        PrintStream cout = new PrintStream(soc.getOutputStream(),true);
        cout.println(str);
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(in.readLine());
    }
}
