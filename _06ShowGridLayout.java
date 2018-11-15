package practice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-14
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _06ShowGridLayout extends JFrame {
    public _06ShowGridLayout() {
        setLayout(new GridLayout(3, 6, 20, 20));

        // Add labels and text fields
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(10));
        add(new JLabel("Last Name"));
        add(new JTextField(10));
    }

    public static void main(String[] args) {
        _06ShowGridLayout frame = new _06ShowGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(300, 125);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
