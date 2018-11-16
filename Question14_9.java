package practice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-15
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
class Question14_9 extends JFrame {
    private Container container;
    private JTextField result;
    private JPanel panel = new JPanel();
    private JButton buttons[] = new JButton[16];


    public Question14_9()
    {
        super ("Calculator");
        container = getContentPane();
        result = new JTextField("",JTextField.RIGHT);
        result.setEditable(false);
        result.setBackground(Color.white);

        for (int i=0 ; i<=9 ; i++){
            buttons[i] = new JButton(String.valueOf(i));
        }
        buttons[10] = new JButton("/");
        buttons[11] = new JButton("*");
        buttons[12] = new JButton("-");
        buttons[13] = new JButton(".");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("+");

        panel.setLayout(new GridLayout(4,4));
        for(int i=7; i<=9 ; i++){
            panel.add(buttons[i]);
        }
        panel.add(buttons[10]);

        for(int i=4; i<=6 ; i++){
            panel.add(buttons[i]);
        }
        panel.add(buttons[11]);

        for(int i=1; i<=3 ; i++){
            panel.add(buttons[i]);
        }
        panel.add(buttons[12]);

        panel.add(buttons[0]);
        panel.add(buttons[13]);
        panel.add(buttons[14]);
        panel.add(buttons[15]);


        container.add(result,BorderLayout.NORTH);
        container.add(panel);

        setSize(300,300);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main (String[] args) {
        new Question14_9();
    }


}
