package fileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
	//字节流输入  用于在内存中不需要查看文件的字符内容。

	public static void main(String[] args) throws IOException {
		//异常时没有找到该文件。
		FileInputStream fis = new FileInputStream("C:/1.txt");//构建了一个字节输入流，并且是从C:/1.txt这个文件流入内存。 fis是流对象。	
		byte[] b1 = new byte[1024];
		b1[0] = 'h';
		b1[1] = 'h';
		b1[2] = 'h';
		b1[3] = ':';
		int num1;
		while((num1 = fis.read(b1, 4, 100))!= -1){
			String str1 = new String(b1,0,num1+4);
			System.out.println(str1);
		}
		fis.close();
	}

}
