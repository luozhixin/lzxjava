package Extends;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in); 
		Fruits f;
		System.out.print("��ѡ����Ҫ�����ˮ����1.���� 2.���ܹ� 3.���棩��");
		int a=input.nextInt();
		if(a==1) {
			f=new Durian("����", "���ų���������");
			f.eat();
		}
		if(a==2) {
			f=new HamiMelon("���ܹ�", "���ˬ��");
			f.eat();
		}
		if(a==3) {
			f=new WildJujube("����", "�ǳ���");
			f.eat();
		}

	}

}
abstract class Fruits{
	private String name;
	private String taste;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public abstract void eat();
	
}
class HamiMelon extends Fruits{
	public HamiMelon(String name,String taste) {
		setName(name);
		setTaste(taste);
		// TODO Auto-generated constructor stub
	}
	@Override
public void eat() {
		System.out.println(getName()+":");
		System.out.println("�ڸУ�"+getTaste());
		System.out.println("��Ҫ�гɿ��ٳԣ�");
	// TODO Auto-generated method stub
	
}
}
class Durian extends Fruits{
	public Durian(String name,String taste) {
		setName(name);
		setTaste(taste);
		// TODO Auto-generated constructor stub
	}
	@Override
public void eat() {
		System.out.println(getName()+":");
		System.out.println("�ڸУ�"+getTaste());
	// TODO Auto-generated method stub
		System.out.println("��Ҫ�������ص�����ٳԣ�");
}
}class WildJujube extends Fruits{
	public WildJujube(String name,String taste) {
		setName(name);
		setTaste(taste);
		// TODO Auto-generated constructor stub
	}
	@Override
public void eat() {
	// TODO Auto-generated method stub
		System.out.println(getName()+":");
		System.out.println("�ڸУ�"+getTaste());
		System.out.println("��Ҫ�³����ٳԣ�");
}
}






