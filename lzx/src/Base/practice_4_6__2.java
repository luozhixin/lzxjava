package Base;
import java.util.Scanner;
//2.��Ŀ��������������x,y,z���������������С���������   
public class practice_4_6__2 {
	private static Scanner a;

	public static void main(String args[]) {
		while(true) {
			int q;
		System.out.println("��������������������");
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
		System.out.print("x,y,z��С��������Ϊ"+x);
		System.out.print(","+y);
		System.out.print(","+z);


		}
	}
}
