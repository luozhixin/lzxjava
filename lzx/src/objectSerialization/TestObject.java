package objectSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
	//序列化和反序列化    解决问题:文件保存只是单个类型       程序在内存中使用的是对象。
	//序列化就是将内存中的对象整个完整的保存到文件中。   反序列化：从文件中读出整个对象。
	//被序列化的对象需要实现一个序列化的接口
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Person p = new Person("张三","123456",12);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/9.txt"));
		oos.writeObject(p);
		oos.close();

		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/9.txt"));
		Person p1 = (Person) ois.readObject();
		System.out.println(p1);
		ois.close();
	}

}
