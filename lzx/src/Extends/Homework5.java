package Extends;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird();
		b.fly();
		b.eat();
		Sparrow s=new Sparrow("��", "�Һ�ɫ");
		s.fly();
		s.eat();
		Penguin p=new Penguin("QQ", "�ڰ�ɫ");
		p.fly();
		p.eat();
		p.swim();
	}

}
class Bird{
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void fly() {
		System.out.println("�������һ��");
	}
	public void eat() {
		System.out.println("�������ҳԵĲ��Ƿ��Ǽ�į");
	}
}
class Sparrow extends Bird{
	public Sparrow(String name,String color) {
		setName(name);
		setColor(color);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("������ȸ"+getName()+"���Ҷ������ݣ��ɵıȻ������");
	}
	public void eat() {
		System.out.println("�Ҳ��������ӣ�Ҳ�Ժ���");
	}
}
class Penguin extends Bird{
	public Penguin(String name,String color) {
		setName(name);
		setColor(color);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("�������"+getName()+"����̫���ˣ����Բ���ɣ�");
	}
	public void eat() {
		System.out.println("��ϲ������");
	}
	public void swim() {
		System.out.println("��Ȼ�Һ��֣����ұ����εÿ�");
	}
}