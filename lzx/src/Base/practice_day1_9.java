package Base;
import java.util.Scanner;

public class practice_day1_9 {
	private static Scanner a;
//��˼���⣩�����������С��ʱ���ܲ��ܲ����м�������󣬶�ֱ�������
	public static void main(String args[]) {
		while(true) {
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
		System.out.print("x,y,z��С��������Ϊ"+x+","+y+","+z);
		System.out.println();
		}
	}
}


