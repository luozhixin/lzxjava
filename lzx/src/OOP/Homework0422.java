package OOP;

import java.util.Scanner;

public class Homework0422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第一道题");
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		MyMath mymath=new MyMath();
		System.out.print("求绝对值。请输入数据：");
		int a=input.nextInt();
		System.out.println(a+"的绝对值为      "+mymath.abs(a));
		System.out.println();
		System.out.println("求x的y次方。请输入数据：");
		System.out.print("x：");
		int x=input.nextInt();
		System.out.print("y：");
		int y=input.nextInt();
		System.out.println(x+"的"+y+"次方为     "+mymath.pow(x,y));
		System.out.println();
		System.out.print("求四舍五入值。请输入数据：");
		float a1=input.nextFloat();
		System.out.println(a1+"的四舍五入值为    "+mymath.round(a1));
		System.out.println();
		System.out.println();
		System.out.println("2.定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试了Test，进行测试");
		DemoTest demotest=new DemoTest();
		demotest.test();
		System.out.println();
		System.out.println();
		System.out.println("3.定义一个长方形类,定义 求周长和面积的方法，然后定义一个测试了Test2，进行测试。");
		RectangleTest re=new RectangleTest();
		re.test2();
		System.out.println();
		System.out.println();
		System.out.println("4.定义一个员工类,自己分析出几个成员，然后给出成员变量，构造方法， getXxx()/setXxx()方法，以及一个显示所有成员信息的方法。并测试。");
		Staff staff=new Staff(18,"李小二","男","manager");
		staff.print();
		//5.定义一个类MyMath1,提供基本的加减乘除功能，然后进行测试。
		//6.定义一类圆，求圆的周长和面积
	}

}
class MyMath{
	//第一题：1.编辑一个MyMath类，（要求:全部使用自己编辑的代码不能调用系统中的Math类中的任何方法）
	
	
	int abs(int a) {//实现方法int abs(int a);根据参数a返回结果是a的绝对值。
		if(a<0) {
			a=0-a;
		}
		return a;
	}
	float pow(int x,int y) {//实现方法int pow(int x,int y); 求出x的y次方的结果并返回。

		float sum=1;
		int p=y;
		if(y<0) {
			y=0-y;
		}
		if(y==0) {sum=1;}else {
		for(int i=1;i<=y;i++) {
			sum*=x;
		}
		}
		if(p<0) {
			sum=1/sum;
		}
		return sum;
		
	}
	int round(float a) {//		实现方法 int round(float a); 根据a的值返回四舍五入的整型值。
		int b=(int) a;
		float c=a-b;
		if(c>0.5) {
			b++;
		}
        if(c<-0.5) {
			b--;
		}
        return b;
	}

}
class Demo{//第二题：定义一个类Demo,其中定义一个求两个数据和的方法
	int add(int x,int y){
		return x+y;
	}
}
class DemoTest{//定义一个测试类，进行测试。
	Demo demo=new Demo(); 
	Scanner input =new Scanner(System.in);
	void test() {
		System.out.println("请输入x:");
		int x=input.nextInt();
		System.out.println("请输入y:");
		int y=input.nextInt();
		System.out.println("两个数据和:"+demo.add(x, y));
	}
}

class Rectangle{//3.定义一个长方形类,定义 求周长和面积的方法，然后定义一个测试了Test2，进行测试。
	int size(int x,int y) {
		return x*y;
	}
	int perimeter(int x,int y){
		return 2*(x+y);
	}
}
class RectangleTest{//定义一个测试类，进行测试。
	Rectangle demo=new Rectangle(); 
	Scanner input =new Scanner(System.in);
	void test2() {
		System.out.println("请输入宽x:");
		int x=input.nextInt();
		System.out.println("请输入高y:");
		int y=input.nextInt();
		System.out.println("长方形面积为:"+demo.size(x, y));
		System.out.println("长方形周长为:"+demo.perimeter(x, y));
	}
}

class Staff{//4.定义一个员工类,自己分析出几个成员，然后给出成员变量，构造方法， 
	//getXxx()/setXxx()方法，以及一个显示所有成员信息的方法。并测试。
	int age;
	String name,sex,position;
	Staff(int age,String name,String sex,String position){
		setAge(age);
		setName(name);
		setPosition(position);
		setSex(sex);
	}
	void print() {
		System.out.println("姓名："+this.name);
		System.out.println("年龄："+this.age);
		System.out.println("性别："+this.sex);
		System.out.println("职位："+this.position);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
				
}

