package com.daysun.javase.awt;

import java.awt.*;

/**
 * Created by Administrator on 2016/9/27.
 */
public class FrameTest extends Frame {
    private Button bn,bs,bw,be,bc;
    private Frame frame;
    public FrameTest(String title){
        super(title);
    }

    public void go(){
        frame=new Frame("Border Layout");
        bn=new Button("b1");
        bs=new Button("b2");
        bw=new Button("b3");
        be=new Button("b4");
        bc=new Button("b5");

        frame.add(bn,BorderLayout.NORTH);
        frame.add(bs,BorderLayout.SOUTH);
        frame.add(bw,BorderLayout.WEST);
        frame.add(be,BorderLayout.EAST);
        frame.add(bc,BorderLayout.CENTER);

        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FrameTest frameTest=new FrameTest("First GUI App");
      /*  frameTest.setSize(500,500);
       // frameTest.getBackground(Color.GREEN);
        frameTest.setVisible(true);*/

      frameTest.go();


    }

}
