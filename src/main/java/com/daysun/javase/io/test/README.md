Java IO教程
http://ifeve.com/java-io/

深入分析 Java I/O 的工作机制
https://www.ibm.com/developerworks/cn/java/j-lo-javaio/

Java深度历险（八）——Java I/O
http://www.infoq.com/cn/articles/cf-java-i-o



Java中的IO整理(Good)
http://www.cnblogs.com/rollenholt/archive/2011/09/11/2173787.html

Java 流(Stream)、文件(File)和IO
http://www.runoob.com/java/java-files-io.html


http://duan1823a.iteye.com/blog/907153(很详细)
IO分两种流

字节流 InputStream OutputStream

字符流 Reader  Writer

他们都是抽象类

具体实现
字节流 FileInputStream  FileOutputStream
字符流 FileReader    FileWriter


字节流转换成字符流可以用 InputSteamReader  OutputStreamWriter

转换成BufferdReader  BufferedWriter 他们具有缓冲区

例如：读取文件 从字节流输入到字符流输入
定义一个字节流：
Java代码
FileInputStream fileInputStream = new FileInputStream("d:/text.txt");  // 定义一个指向D:/TEXT.TXT 的字节流

InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//字节流转换成InputStreamReader

BufferedReader bufferedReader = new BufferedReader(inputSteamReader);
//InputStreamReader 转换成带缓存的bufferedReader

FileInputStream fileInputStream = new FileInputStream("d:/text.txt");  // 定义一个指向D:/TEXT.TXT 的字节流  InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //字节流转换成InputStreamReader  BufferedReader bufferedReader = new BufferedReader(inputSteamReader); //InputStreamReader 转换成带缓存的bufferedReader


可以把读出来的内容赋值给字符
Java代码
String ss = new String();
String s;
while((s = bufferedReader.readLine())!=null){
    ss += s;
}

String ss = new String(); String s; while((s = bufferedReader.readLine())!=null){  ss += s; }

例如：写入文件  从字节流输出到字符流输出
Java代码
FileOutputStream fileOutputStream = new FileOutputStream("d:/text.txt"); //定义一个

指向D:/TEXT.TXT文件

OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

bufferedWriter.write(s);

bufferedWriter.close();
outputStreamWriter.close();
fileOutputStream.close();


------------------------------------------------------------
字节流和字符流      如果数据流中最小的数据单元是字节，那么称这种流为字节流；如果数据流中最小的数据单元是字符，那么称这种流为字符流。在Java的IO系统 中，java.io.InputStream和java.io.OutputStream分别表示字节输入流和字节输出流，java.io.Reader 和java.io.Writer分别表示字符输入流和字符输出流。I/O流的层次
1．字节流：
从InputStream和OutputStream派生出来的一系列类。这类流以字节(byte)为基本处理单位。
◇ InputStream、OutputStream
◇ FileInputStream、FileOutputStream
◇ PipedInputStream、PipedOutputStream
◇ ByteArrayInputStream、ByteArrayOutputStream
◇ FilterInputStream、FilterOutputStream
◇ DataInputStream、DataOutputStream
◇ BufferedInputStream、BufferedOutputStream
2．字符流：
从Reader和Writer派生出的一系列类，这类流以16位的Unicode码表示的字符为基本处理单位。
◇ Reader、Writer
◇ InputStreamReader、OutputStreamWriter
◇ FileReader、FileWriter
◇ CharArrayReader、CharArrayWriter
◇ PipedReader、PipedWriter
◇ FilterReader、FilterWriter
◇ BufferedReader、BufferedWriter
◇ StringReader、StringWriter
3．对象流
◇ ObjectInputStream、ObjectOutputStream
4．其它
◇ 文件处理：
File、RandomAccessFile；
◇ 接口
DataInput、DataOutput、ObjectInput、ObjectOutput----------------------------------------------------------------------------------------

IO分两种流

字节流 InputStream OutputStream

字符流 Reader Writer

他们都是抽象类

具体实现
字节流 FileInputStream FileOutputStream
字符流 FileReader FileWriter

       字符流处理的单元为2个字节的Unicode字符，分别操作字符、字符数组或字符串，而字节流处理单元为1个字节， 操作字节和字节数组。所以字符流是由Java虚拟机将字节转化为2个字节的Unicode字符为单位的字符而成的，所以它对多国语言支持性比较好！如果是 音频文件、图片、歌曲，就用字节流好点，如果是关系到中文（文本）的，用字符流好点.
所有文件的储存是都是字节（byte）的储存，在磁盘上保留的并不是文件的字符而是先把字符编码成字节，再储存这些字节到磁盘。在读取文件（特别是文本文件）时，也是一个字节一个字节地读取以形成字节序列.
字节流可用于任何类型的对象，包括二进制对象，而字符流只能处理字符或者字符串； 2. 字节流提供了处理任何类型的IO操作的功能，但它不能直接处理Unicode字符，而字符流就可以。



字节流转换成字符流可以用 InputSteamReader OutputStreamWriter

转换成BufferdReader BufferedWriter 他们具有缓冲区

例如：读取文件 从字节流输入到字符流输入
定义一个字节流：

Java代码 <embed height="15" width="14" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" allowscriptaccess="always" quality="high" flashvars="clipboard=FileInputStream%20fileInputStream%20%3D%20new%20FileInputStream(%22d%3A%2Ftext.txt%22)%3B%0A%2F%2F%20%E5%AE%9A%E4%B9%89%E4%B8%80%E4%B8%AA%E6%8C%87%E5%90%91D%3A%2FTEXT.TXT%20%E7%9A%84%E5%AD%97%E8%8A%82%E6%B5%81%20%0A%0AInputStreamReader%20inputStreamReader%20%3D%20new%20InputStreamReader(fileInputStream)%3B%20%0A%2F%2F%E5%AD%97%E8%8A%82%E6%B5%81%E8%BD%AC%E6%8D%A2%E6%88%90InputStreamReader%20%0A%0ABufferedReader%20bufferedReader%20%3D%20new%20BufferedReader(inputSteamReader)%3B%20%0A%2F%2FInputStreamReader%20%E8%BD%AC%E6%8D%A2%E6%88%90%E5%B8%A6%E7%BC%93%E5%AD%98%E7%9A%84bufferedReader%0A%0A%E5%8F%AF%E4%BB%A5%E6%8A%8A%E8%AF%BB%E5%87%BA%E6%9D%A5%E7%9A%84%E5%86%85%E5%AE%B9%E8%B5%8B%E5%80%BC%E7%BB%99%E5%AD%97%E7%AC%A6%20%0AString%20ss%20%3D%20new%20String()%3B%20%0AString%20s%3B%20%0Awhile((s%20%3D%20bufferedReader.readLine())!%3Dnull)%7B%20%0A%20%20%20%20%20%20%20%20ss%20%2B%3D%20s%3B%20%0A%7D%20" src="http://suan2046.iteye.com/javascripts/syntaxhighlighter/clipboard_new.swf">
FileInputStream fileInputStream = new FileInputStream("d:/text.txt");
// 定义一个指向D:/TEXT.TXT 的字节流

InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//字节流转换成InputStreamReader

BufferedReader bufferedReader = new BufferedReader(inputSteamReader);
//InputStreamReader 转换成带缓存的bufferedReader

可以把读出来的内容赋值给字符
String ss = new String();
String s;
while((s = bufferedReader.readLine())!=null){
        ss += s;
}

FileInputStream fileInputStream = new FileInputStream("d:/text.txt"); // 定义一个指向D:/TEXT.TXT 的字节流   InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);  //字节流转换成InputStreamReader   BufferedReader bufferedReader = new BufferedReader(inputSteamReader);  //InputStreamReader 转换成带缓存的bufferedReader  可以把读出来的内容赋值给字符  String ss = new String();  String s;  while((s = bufferedReader.readLine())!=null){          ss += s;  }

例如：写入文件 从字节流输出到字符流输出

Java代码
FileOutputStream fileOutputStream = new FileOutputStream("d:/text.txt");

//定义一个指向D:/TEXT.TXT文件

OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

bufferedWriter.write(s);

bufferedWriter.close();
outputStreamWriter.close();
fileOutputStream.close();

FileOutputStream fileOutputStream = new FileOutputStream("d:/text.txt");  //定义一个指向D:/TEXT.TXT文件  OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);  BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);  bufferedWriter.write(s);  bufferedWriter.close(); outputStreamWriter.close(); fileOutputStream.close();



例程：
将字符串转化为字节流 #region  将字符串转化为字节流
           /**/ ///   <summary>
          ///  将字符串转化为字节流
          ///   </summary>
          ///   <param name="_Source"> 字串 </param>
          ///   <returns> 字节流 </returns>
          public   static   byte [] String2Bytes( string  strSource)
            {
             System.IO.MemoryStream   memoryStream = new    System.IO.MemoryStream();
             System.IO.BinaryWriter   binaryWriter = new    System.IO.BinaryWriter(memoryStream);
             binaryWriter.Write( strSource );
              byte []   buffer = memoryStream.GetBuffer();
              return  buffer;
         }
          #endregion


           将字节流转化为字符串 #region  将字节流转化为字符串
           /**/ ///   <summary>
          ///  将字节流转化为字符串
          ///   </summary>
          ///   <param name="bytData"> 字节流 </param>
          ///   <returns> 字串 </returns>
          public   static   string  Bytes2String( byte [] bytData)
            {
              // 字节流->字符串
             System.IO.MemoryStream   memoryStream2  =   new    System.IO.MemoryStream(bytData);
             System.IO.BinaryReader   binaryReader  =   new    System.IO.BinaryReader(memoryStream2);
              string    s2 = binaryReader.ReadString();
              return  s2;
         }
          #endregion

FileOutputStream fileOutputStream = new FileOutputStream("d:/text.txt"); //定义一个  指向D:/TEXT.TXT文件   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);  BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);  bufferedWriter.write(s);  bufferedWriter.close(); outputStreamWriter.close(); fileOutputStream.close();




