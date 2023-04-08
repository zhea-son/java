import javax.swing.*;
import java.awt.*;

public class idk extends JFrame {
    
    public idk() {
        super("Example Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the left panel for 5 buttons
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        for (int i = 1; i <= 5; i++) {
            leftPanel.add(new JButton("Button " + i));
        }
        
        // Create the right panel for 3 buttons
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        for (int i = 6; i <= 8; i++) {
            rightPanel.add(new JButton("Button " + i));
        }
        
        // Create the main panel and add the left and right panels to it
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);
        
        // Add the main panel to the frame
        getContentPane().add(mainPanel);
        
        // Pack and show the frame
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new idk());
    }
}