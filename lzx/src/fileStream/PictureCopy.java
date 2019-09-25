package fileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PictureCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/1.jpg");
		FileOutputStream fos = new FileOutputStream("d:/2.jpg");
		byte[] b = new byte[1024];  //一般性能高8k-16k
		int num ;
		long l1 = System.currentTimeMillis();//获取系统时间
		while((num=fis.read(b))!=-1){
			fos.write(b, 0, num);
		}
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
		fos.close();
		fis.close();
	}

}
