package practice;

import javax.swing.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-14
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _07MyJFrameUsingJPanel extends JFrame {

    private JButton jbtOk;
    private JButton jbtCancel;
    private JPanel panel;

    public _07MyJFrameUsingJPanel(String title) {

        panel = new JPanel();

        jbtOk = new JButton("OK");
//		this.jbtOk.setText("New OK");
        panel.add(jbtOk);

        jbtCancel = new JButton("Cancel");
        panel.add(jbtCancel);

        this.add(panel);
        this.setTitle(title);
        this.setSize(400, 300); // Set the frame size
        this.setLocationRelativeTo(null);// Center a frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); // Display the frame
        this.setResizable(false);
    }

    public static void main(String[] args) {
        _07MyJFrameUsingJPanel myFrame = new _07MyJFrameUsingJPanel("My Frame");
    }
}
