package objectSerialization;

import java.io.Serializable;

public class Person implements Serializable{//���л��������̳�Serializable�ӿ�
	private static final long serialVersionUID = -6237117637047088338L;
	private String name;
	private transient String pd;//�ؼ���transientʹ�䲻�����л�
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPd() {
		return pd;
	}
	public void setPd(String pd) {
		this.pd = pd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, String pd, int age) {
		super();
		this.name = name;
		this.pd = pd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pd=" + pd + ", age=" + age + "]";
	}
}
