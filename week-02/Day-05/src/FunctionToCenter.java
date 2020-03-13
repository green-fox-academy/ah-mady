import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

/*        int x = (int) (Math.random()* WIDTH);
        int y = (int) (Math.random()*HEIGHT);*/
        int x = 0;
        int y = 0;


        /*for (int i = 0; i < (WIDTH / 18); i++) {
            if (i == 16) {
                for (int j = 0; j < 17; j++) {
                    drawLinesToCenter(x, y, graphics);
                    y += 20;
                    if (j == 16) {
                        for (int k = 0; k < 17; k++) {
                            drawLinesToCenter(x, y, graphics);
                            x -= 20;
                            if (k == 16) {
                                for (int l = 0; l < 17; l++) {

                                    drawLinesToCenter(x, y, graphics);

                                    y -= 20;
                                }
                            }
                        }
                    }
                }

            }

            drawLinesToCenter(x, y, graphics);
            x += 20;
            // y += 20;
        }*/






        for (int i = 0; i < 64; i++) {

            if (i < 16) {
                drawLinesToCenter(x, y, graphics);
                x += 20;
            } else if (i >= 16 && i < 32) {
                drawLinesToCenter(x, y, graphics);
                y += 20;
            } else if (i >= 32 && i < 48) {
                drawLinesToCenter(x, y, graphics);
                x -= 20;
            } else {
                drawLinesToCenter(x, y, graphics);
                y -= 20;
            }
        }

    }


    public static void drawLinesToCenter(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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
