package com.daysun.javase.io.stream;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/*
 * IO:用于处理不同设备之间的数据传递问题。最终你要能够理解：上传和下载文件原理即可。
 * IO流的分类：
 * 		流向：
 * 			输入	读取数据
 * 			输出	写出数据
 * 		数据类型：
 * 			字节
 * 				字节输入流	读取数据	InputStream
 * 				字节输出流	写出数据	OutputStream
 * 			字符
 * 				字符输入流	读取数据	Reader
 * 				字符输出流	写出数据	Writer
 *
 * 	一般情况下，如果别人问你IO流的分类，默认指定的是数据类型。
 * 	注意：不同体系的流对象，一般都是以所在体系的抽象基类名称作为后缀名。
 *      1:在流中是怎么换行的呢?
 * 		在windows中，换行是：\r\n
 * 		而记事本是windows自带的软件，所以，识别换行的时候，是依赖\r\n的。
 * 		有很多的高级记事本软件，它们是可以识别各种换行符号的。
 * 		windows: \r\n
 * 		linux: \n
 * 		mac: \r
 *
 * 2:如何追加写数据。
 * 		FileWriter(String fileName, boolean append)：根据第二个参数是否是true来决定是否追加写入。
 *      FileWriter fw = new FileWriter("c.txt",true);
 */
public class FileWriterDemo {
    @Test
    public void f1() throws IOException {
        FileWriter fw = new FileWriter("./a.txt");
        fw.write("同学们爱Java,老师爱林青霞");

        //把数据从缓冲区刷新到文件中。
        fw.flush();

        //最后一步，释放资源
        //void close():在释放资源前，先自动调用一次flush()。
        fw.close();

        /**
         * 面试题：为什么要close()?
         * A:告诉流对象，你是垃圾了。
         * B:通知系统，释放跟该文件相关的资源。
         *
         * 面试题2：flush()和close()的区别?
         * A:flush():刷新缓冲区，流对象还可以继续使用。
         * B:close():先刷新缓冲区，释放资源，流对象不能继续在使用。
         */
    }

    /**
     * 1：wirte方法。
     *  void write(char[] cbuf) 写入字符数组。
     *  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
     *  void write(int c) 写入单个字符。
     *  void write(String str) 写入字符串。
     *  void write(String str, int off, int len) 写入字符串的某一部分。
     */

    @Test
    public void f2() throws IOException {
        FileWriter fw = new FileWriter("./a.txt");
        fw.write("同学们爱Java,老师爱林青霞");

        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(chs);


        fw.write(97);
        fw.write('a');

        //void write(String str, int off, int len) 写入字符串的某一部分。
        fw.write("world",0,2);

        //最后一步，释放资源
        //void close():在释放资源前，先自动调用一次flush()。
        fw.close();

    }

    /**
     * 异常处理
     * @throws IOException
     */
    @Test
    public void f3() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("fw.txt");
            fw.write("加入异常处理");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try{
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
