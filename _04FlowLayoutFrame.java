package practice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-14
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _04FlowLayoutFrame extends JFrame{

    public _04FlowLayoutFrame(){
//		FlowLayout myFlowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 30);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30));

        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(10));
        add(new JLabel("Last Name"));
        add(new JTextField(20));
    }

    public static void main(String[] args){
        _04FlowLayoutFrame myFrame = new _04FlowLayoutFrame();
        myFrame.setSize(250,250);
        myFrame.setVisible(true);
        myFrame.setResizable(false);

    }

}
