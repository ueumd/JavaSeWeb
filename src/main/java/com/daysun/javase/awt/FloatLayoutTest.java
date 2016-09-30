package com.daysun.javase.awt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Administrator on 2016/9/27.
 */
public class FloatLayoutTest {

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public FloatLayoutTest() {
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("aaaaa");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("aaaaa");
            }
        });
    }
}
