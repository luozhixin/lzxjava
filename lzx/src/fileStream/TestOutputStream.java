 package fileStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) throws IOException {
		//该异常不是文件找不到，是文件夹找不到的异常。    输出流可以没有该文件。
		FileOutputStream fos = new FileOutputStream("c:/3.txt");
		fos.write("hello 中国! \r\n".getBytes());
		fos.close();
	}
}
