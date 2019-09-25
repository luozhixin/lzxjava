package Extends;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird();
		b.fly();
		b.eat();
		Sparrow s=new Sparrow("嘟嘟", "灰黑色");
		s.fly();
		s.eat();
		Penguin p=new Penguin("QQ", "黑白色");
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
		System.out.println("我是鸟，我会飞");
	}
	public void eat() {
		System.out.println("我是鸟，我吃的不是饭是寂寞");
	}
}
class Sparrow extends Bird{
	public Sparrow(String name,String color) {
		setName(name);
		setColor(color);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("我是麻雀"+getName()+"，我动作敏捷，飞的比火箭都快");
	}
	public void eat() {
		System.out.println("我不仅吃种子，也吃害虫");
	}
}
class Penguin extends Bird{
	public Penguin(String name,String color) {
		setName(name);
		setColor(color);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("我是企鹅"+getName()+"，我太胖了，所以不会飞，");
	}
	public void eat() {
		System.out.println("我喜欢吃鱼");
	}
	public void swim() {
		System.out.println("虽然我很胖，但我比鱼游得快");
	}
}