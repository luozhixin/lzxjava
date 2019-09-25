package Base;
import java.util.Scanner;
//3.题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
public class practice_4_6__3 {
	private static Scanner s;

	public static void main(String args[]) {
		while(true) {
		System.out.println("请输入一个五位数：");
		s = new Scanner(System.in);
		int x=s.nextInt();
		int b=x;
		int a=0;
		while(true) 
		{
		a=a*10+x%10;
		x=x/10;
		if(x==0)
		{
			break;
		}
		}
		if(b==a)
		{
			System.out.println("此数是回文数");
		}else {
			
			System.out.println("此数不是回文数");
		}
		}
		
	}
}
