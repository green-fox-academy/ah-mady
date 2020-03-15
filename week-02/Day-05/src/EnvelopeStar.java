import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int steps = 20;
        int patternWidth = WIDTH / 2;
        for (int i = 1; i < steps; i++) {
            int distance = i * patternWidth / steps;
            graphics.setColor(new Color(50, 205, 50));
            graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
            graphics.drawLine(WIDTH / 2, WIDTH - distance, WIDTH / 2 + distance, HEIGHT / 2);
            graphics.drawLine(WIDTH/2, WIDTH - distance, WIDTH / 2 - distance, HEIGHT/2);
            graphics.drawLine(WIDTH/2, distance, WIDTH/2 - distance, WIDTH/2);
            graphics.drawLine(WIDTH/2, WIDTH/2 - distance, WIDTH-distance, HEIGHT/2);
        }


    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
