package practice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-14
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _05ShowBorderLayout extends JFrame {

    public _05ShowBorderLayout() {

        setLayout(new BorderLayout(20, 40));
        JButton jbtNorth = new JButton("North");
        Color color = new Color(0,0,255);
        jbtNorth.setBackground(color);
        jbtNorth.setForeground(new Color(255,0,0));//Color

        jbtNorth.setBackground(Color.blue);

        // Add buttons
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(jbtNorth, BorderLayout.NORTH);
        add(new JButton("Center"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        _05ShowBorderLayout frame = new _05ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
