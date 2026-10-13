import javax.swing.*;
import java.awt.*;

public class LayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout Demo");

        f.setLayout(new FlowLayout());

        f.add(new JButton("Button 1"));
        f.add(new JButton("Button 2"));
        f.add(new JButton("Button 3"));

        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
