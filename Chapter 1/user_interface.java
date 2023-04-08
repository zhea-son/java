import javax.swing.*;

public class user_interface {
    user_interface(){
        JFrame f =new JFrame("Form");
        JLabel l = new JLabel("Username");
        l.setBounds(100,100,100,100);
        f.add(l);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);

        // JTextField tf = new JTextField("Username");
        // tf.setBounds(130,40,40,20);
        // f.add(tf);
        // f.setVisible(true);
        // f.setSize(350,450);
        // f.setLayout(null);

    }

    public static void main(String[] args) {
        new user_interface();
    }
}
