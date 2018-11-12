package practice;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-11
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _03FrameWithComponent {
    public static void main(String[] args){
        JFrame frame1 = new JFrame("Frame With Components");

        JButton ok = new JButton("ok");
        frame1.add(ok);
        JButton cancel = new JButton("cancel");
        frame1.add(cancel);
//duplicated button

        frame1.setSize(400, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
}
