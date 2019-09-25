package Extends;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in); 
		Fruits f;
		System.out.print("请选择需要购买的水果（1.榴莲 2.哈密瓜 3.酸枣）：");
		int a=input.nextInt();
		if(a==1) {
			f=new Durian("榴莲", "闻着臭，吃着香");
			f.eat();
		}
		if(a==2) {
			f=new HamiMelon("哈密瓜", "香脆爽口");
			f.eat();
		}
		if(a==3) {
			f=new WildJujube("酸枣", "非常酸");
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
		System.out.println("口感："+getTaste());
		System.out.println("需要切成块再吃！");
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
		System.out.println("口感："+getTaste());
	// TODO Auto-generated method stub
		System.out.println("需要剥掉厚重的外壳再吃！");
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
		System.out.println("口感："+getTaste());
		System.out.println("需要吐出核再吃！");
}
}






