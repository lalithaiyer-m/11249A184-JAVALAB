import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Controls");

        JLabel l = new JLabel("Enter Name:");
        JTextField t = new JTextField(10);
        JButton b = new JButton("Submit");

        f.setLayout(new FlowLayout());
        f.add(l);
        f.add(t);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,
                    "Hello " + t.getText());
            }
        });

        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
