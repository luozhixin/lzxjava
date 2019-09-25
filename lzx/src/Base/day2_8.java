package Base;
//使用面向对象的思想描述游戏中的怪物
//问题描述：
//某公司要开发新游戏，请用面向对象的思想设计怪物类，设定属性包括：怪物名字、生命值、攻击力、防御力；方法包括：攻击的方法，防御的方法
//要求：1、通过构造函数实现属性赋值
//2、攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
//3、防御方法通过输入参数接收攻击力。需要判断，如果攻击力小于防御力，伤害值=0；反之伤害值=攻击力-防御力根据伤害值情况，显示不同的防御信息。内容包括怪物名字，防御力，防御后的生命值
//4、编写测试方法，通过构造函数实例化怪物类的对象，并调用相关方法（测试数据信息自定）
import java.util.Scanner;

public class day2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monster m=new monster(200,"大龙",220);
		m.print();
		System.out.println("==================");
		while(true) {
			System.out.println("请输入攻击力");
			@SuppressWarnings("resource")
			Scanner i=new Scanner(System.in);
			int g=i.nextInt();
			if(g>m.Defensivepower) {
				g=g-m.Defensivepower;
				System.out.println(m.getName()+"以"+m.Defensivepower+"的防御力防御失败！");
				m.sub(g);
				System.out.println("当前生命值是："+m.getLifevalue());
				
			}else {
				System.out.println(m.getName()+"以"+m.Defensivepower+"的防御力防御成功！");
				System.out.println("当前生命值是："+m.getLifevalue());
			}
		}
		
	}

}
class monster{
	private int Lifevalue;
	private String name;
	private int Aggressivity;
	int Defensivepower=20;
	public monster(int l,String n,int a) {
		this.setLifevalue(l);
		this.setName(n);
		this.setAggressivity(a);
		
	}
	public void print() {//打印
		System.out.println("怪物"+this.name+"展开攻击");
		System.out.println("当前生命值是："+this.Lifevalue);
		System.out.println("攻击力："+this.Aggressivity);
		
	}
	public void sub(int l) {
		this.Lifevalue-=l;
		
	}
	
	public int getLifevalue() {
		return Lifevalue;
	}
	public void setLifevalue(int lifevalue) {
		Lifevalue = lifevalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAggressivity() {
		return Aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		Aggressivity = aggressivity;
	}


}
