package Base;
import java.util.Scanner;
//输入三个整形数据，并求出这个数据的最小值。并将最小值打印出来。（通过三目运算符）
public class practice_day1_8 {
	private static Scanner a;

	public static void main(String args[]) {
		while(true) {
			int q;
		System.out.println("请依次输入三个整数：");
		a = new Scanner(System.in);
		System.out.print("x:");
		int x=a.nextInt();
		System.out.print("y:");
		int y=a.nextInt();
		System.out.print("z:");
		int z=a.nextInt();
		if(x>y)
		{
			q=x;
			x=y;
			y=q;
		}
		if(y>z)
		{
			q=y;
			y=z;
			z=q;
		}
		if(x>y)
		{
			q=x;
			x=y;
			y=q;
		}
		System.out.print("x,y,z从小到大依次为"+x+","+y+","+z);
		System.out.println();
		}
	}
}

