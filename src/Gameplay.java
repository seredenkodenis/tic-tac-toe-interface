import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;


public class Gameplay{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tics tics2 = new tics();
        JLabel first = new JLabel("123");

        frame.add(tics2);
       // frame.add(first);
    }

}
