package Base;
import java.util.Scanner;

public class practice_day1_9 {
	private static Scanner a;
//（思考题）我们在求第四小题时，能不能不用中间变量里求，二直接求出来
	public static void main(String args[]) {
		while(true) {
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
			x=x+y;
			y=x-y;
			x=x-y;
		}
		if(y>z)
		{
			y=y+z;
			z=y-z;
			y=y-z;
		}
		if(x>y)
		{
			x=x+y;
			y=x-y;
			x=x-y;
		}
		System.out.print("x,y,z从小到大依次为"+x+","+y+","+z);
		System.out.println();
		}
	}
}


