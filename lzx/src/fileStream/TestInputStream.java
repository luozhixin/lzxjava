package fileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
	//�ֽ�������  �������ڴ��в���Ҫ�鿴�ļ����ַ����ݡ�

	public static void main(String[] args) throws IOException {
		//�쳣ʱû���ҵ����ļ���
		FileInputStream fis = new FileInputStream("C:/1.txt");//������һ���ֽ��������������Ǵ�C:/1.txt����ļ������ڴ档 fis��������	
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
