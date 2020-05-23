/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;

/**
 *
 * @author MyPC
 */
import java.awt.*;

import java.awt.event.*;

 

import javax.swing.*;

public class TrafficLight extends JPanel implements MouseListener {
    private JPanel panel;

    private int status;

    private Color offRed;

    private Color offYellow;

    private Color offGreen;

    public TrafficLight() {
        panel = new JPanel(new FlowLayout());

        panel.setSize(90, 250);

        panel.setBackground(Color.LIGHT_GRAY);

        addMouseListener(this);

        offRed = new Color(128, 0, 0);
        offYellow = new Color(192, 192, 0);

        offGreen = new Color(0, 96, 0);

        status = 0;


    }


    public void paintComponent(Graphics g) {

        // Set the actual colours to the "off" shades to begin with.

        Color actualRed = offRed;

        Color actualYellow = offYellow;

        Color actualGreen = offGreen;

 

        // These combinations match traffic lights in the UK.

        if (status == 0) {

            actualGreen = Color.GREEN;

        } else if (status == 1) {

            actualYellow = Color.YELLOW;

        } else if (status == 2) {

            actualRed = Color.RED;

        } else if (status == 3) {

            actualYellow = Color.YELLOW;

            actualRed = Color.red;

        }

 

        // Now draw the lights once each

        drawLight(g, 10, actualRed);

        drawLight(g, 90, actualYellow);

        drawLight(g, 170, actualGreen);

    } 

    private void drawLight(Graphics g, int height, Color colour) {

        g.setColor(colour);

        g.fillOval(10, height, 70, 70);

        g.setColor(Color.BLACK);

        g.drawOval(10, height, 70, 70);

    }
    public void mouseClicked(MouseEvent event) {

        status = status + 1;

        if (status == 4) {
            status = 0;

        }

        repaint();

    }
    public void mouseEntered(MouseEvent event) {

    }
    public void mouseExited(MouseEvent event) {
    }
    public void mousePressed(MouseEvent event) {
    }
    public void mouseReleased(MouseEvent event) {
    }
    public static void main(String[] args) {
        JFrame win = new JFrame("Traffic Light");

        win.setSize(130, 290);

        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.add(new TrafficLight());
        // win.pack();
        win.setVisible(true);
    }
}
