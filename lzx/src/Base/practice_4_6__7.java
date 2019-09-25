package Base;
import java.util.Scanner;
//7.题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，输入一个月份，求当月的兔子总数为多少？   
public class practice_4_6__7 {
	private static Scanner s;

	public static void main(String[] args) {
		while(true)
		{
System.out.print("请输入月份：");
long a=1;
long b=1;
long c;
s = new Scanner(System.in);
long x=s.nextLong();
long d=x;
if(x<3) {System.out.println("兔子总数为2对");}
if(x>=3) {
	while(true)
	{
		c=b;
		b=a+b;
		a=c;
		x--;
		if(x<3)
		{
			break;
		}
		
	}
System.out.println(d+"月后兔子总数为"+b+"对");
}
}
}
}
