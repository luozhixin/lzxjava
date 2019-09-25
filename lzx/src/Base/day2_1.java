package Base;
import java.util.Scanner;
//类的成员变量 猜数字游戏一个类A有一个成员变量v有一个初值为0-100的整数。
//定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
public class day2_1 {

	public static void main(String[] args) {
		A A=new A();
		@SuppressWarnings("resource")
		Scanner i=new Scanner(System.in);
		first:while(true)
		{
			System.out.println("请输入猜测值：");
			int a=i.nextInt();
			if(a>A.v) {System.out.println("猜错了，输入的值过大");}
			if(a<A.v) {System.out.println("猜错了，输入的值过小");}
			if(a==A.v) {System.out.println("恭喜你，猜对了");break first; }
		}
		// TODO Auto-generated method stub


	}

	
}
 class A {

	int v=(int)(Math.random()*(101-0)+0);


}
