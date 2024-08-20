package homePractice;

import javax.swing.*;
import java.awt.*;

public class Code12_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FlowLayout 연습");

        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 15));

        JButton btn1 = new JButton("버튼1");
        frame.add(btn1, BorderLayout.NORTH);
        JButton btn2 = new JButton("버튼2");
        frame.add(btn2, BorderLayout.WEST);
        JButton btn3 = new JButton("버튼3");
        frame.add(btn3, BorderLayout.CENTER);
        JButton btn4 = new JButton("버튼4");
        frame.add(btn4, BorderLayout.EAST);
        JButton btn5 = new JButton("버튼5");
        frame.add(btn5, BorderLayout.SOUTH);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}

