 package fileStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) throws IOException {
		//���쳣�����ļ��Ҳ��������ļ����Ҳ������쳣��    ���������û�и��ļ���
		FileOutputStream fos = new FileOutputStream("c:/3.txt");
		fos.write("hello �й�! \r\n".getBytes());
		fos.close();
	}
}
