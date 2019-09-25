package Base;
import java.util.Scanner;
//通过键盘输入两个整数，然后打印出两个数据的和。
public class practice_day1_2 {
	private static Scanner a;

	public  static void main(String arg[])
	{
		a = new Scanner(System.in);
		System.out.println("依次输入x，y");
		int x=a.nextInt();
		int y=a.nextInt();
		System.out.print("x+y="+(x+y));
	}
}
