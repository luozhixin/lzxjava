package objectSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
	//���л��ͷ����л�    �������:�ļ�����ֻ�ǵ�������       �������ڴ���ʹ�õ��Ƕ���
	//���л����ǽ��ڴ��еĶ������������ı��浽�ļ��С�   �����л������ļ��ж�����������
	//�����л��Ķ�����Ҫʵ��һ�����л��Ľӿ�
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Person p = new Person("����","123456",12);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/9.txt"));
		oos.writeObject(p);
		oos.close();

		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/9.txt"));
		Person p1 = (Person) ois.readObject();
		System.out.println(p1);
		ois.close();
	}

}
