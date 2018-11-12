package practice;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-11
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _02TestFrame {
    public static void main(String[] args){
        JFrame frame1 = new JFrame();
        frame1.setTitle("Window 1");
        frame1.setSize(400, 300);
        frame1.setLocation(200, 100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        JFrame frame2 = new JFrame();
        frame2.setTitle("Window 2");
        frame2.setSize(400, 300);
        frame2.setLocation(300,400);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

        //Two frames open
    }
}
