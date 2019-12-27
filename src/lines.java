import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class lines extends JPanel {
    lines() {
        setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graph = (Graphics2D) g;
        Line2D line = new Line2D.Double(200,0,200,600);
        Line2D line2 = new Line2D.Double(400,0,400,600);
        Line2D line3 = new Line2D.Double(0,200,600,200);
        Line2D line4 = new Line2D.Double(0,400,600,400);
        graph.draw(line);
        graph.draw(line2);
        graph.draw(line3);
        graph.draw(line4);
    }
}
