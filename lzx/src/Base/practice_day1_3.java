package Base;
import java.util.Scanner;
//通过键盘输入两个小数，然后打印出两个数据的差。
public class practice_day1_3 {
	private static Scanner a;

	public  static void main(String arg[])
	{
		a = new Scanner(System.in);
		System.out.println("依次输入x，y");
		float x=a.nextFloat();
		float y=a.nextFloat();
		System.out.print("x-y="+(x-y));
	}
}
