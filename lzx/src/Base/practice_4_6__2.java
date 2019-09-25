package Base;
import java.util.Scanner;
//2.题目：输入三个整数x,y,z，请把这三个数由小到大输出。   
public class practice_4_6__2 {
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
		System.out.print("x,y,z从小到大依次为"+x);
		System.out.print(","+y);
		System.out.print(","+z);


		}
	}
}
