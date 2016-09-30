package com.daysun.javase.io;

import java.io.*;

/**
 * Reader/Writer是字符流，InputStream/OutputStream字节流
 * http://duan1823a.iteye.com/blog/907153
 *
 * FileInputStream与FileOutputStream类
 *http://blog.csdn.net/gyflyx/article/details/6439719
 *
 * 二、基本步骤：
 1、生成文件流对象：对文件读操作时应该为FileInputStream类创建对象，对文件写操作为FileOutputStream类创建对象
 2、调用FileinputStream或fileoutputStream中方法如read()、write(int b)等读写文件内容；
 3、关闭文件流关闭文件；
 */
public class ReadAdnOut {

    //读取字节码
    private static void fisRead() {
        try {
            FileInputStream fis = new FileInputStream("file\\hello.txt");

            byte input[] = new byte[50];//50个字节
            fis.read(input);

            String inputString = new String(input, "UTF-8");
            System.out.println(inputString);


        } catch (Exception e) {
        }
    }

    //写入
    private static void fisOutput() {
        try {
            File f = new File("file\\hello.txt");

            //输出流
            FileOutputStream fos = new FileOutputStream(f);
            String outString = "write hello world123456";

            //使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
            byte[] outputp = outString.getBytes();

            try {
                fos.write(outputp);
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //拷贝modal.jpg成为modal_new.jpg
    private static void copyImg() {
        try {
            FileInputStream fis = new FileInputStream("file\\modal.jpg");
            FileOutputStream fos = new FileOutputStream("file\\modal_new.jpg");

            byte input[] = new byte[100];

            try {
                while (fis.read(input) != -1) {//读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
                    fos.write(input);
                }

                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("done");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    //缓存字节流读取数据
    private static void readByBufferedFile() {
        try {
            FileInputStream fis = new FileInputStream("file\\Shayn.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis, 100000000);//缓冲区大小
            byte input[] = new byte[10000];//10kb 大文件就设置大些
            int count = 0;
            long before = System.currentTimeMillis();

            while (bis.read(input) != -1) {
                count++;
            }
            bis.close();
            fis.close();
            System.out.println(System.currentTimeMillis() - before + "ms");
            System.out.println("读取次数： " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void ReadyByWrite() {
        try {
            File file = new File("file\\hello.txt");

            //通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
            //从文件系统中的某个文件中获得输入字节。
            FileInputStream fis = new FileInputStream(file);

            //每次调用 InputStreamReader 中的一个 read() 方法都会导致从底层输入流读取一个或多个字节。
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            char input[] = new char[100];

            try {
                while (isr.read(input) != -1) {
                    System.out.println(input);
                }

                isr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        // fisRead();

        //  fisOutput();

        //  copyImg();

        // readByBufferedFile();

        ReadyByWrite();
    }
}
