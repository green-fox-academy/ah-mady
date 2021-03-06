import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {


        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,WIDTH,HEIGHT);


        int steps = 10;
        for (int i = 1; i < steps; i++) {
            graphics.setColor(new Color(50,205,50));
            graphics.drawLine(0, i * HEIGHT / steps, i * WIDTH / steps, HEIGHT);
            graphics.setColor(new Color(200,0,200));
            graphics.drawLine(WIDTH, i * HEIGHT / steps, i * WIDTH / steps, 0);
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