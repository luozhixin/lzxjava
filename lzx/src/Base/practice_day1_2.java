package Base;
import java.util.Scanner;
//ͨ��������������������Ȼ���ӡ���������ݵĺ͡�
public class practice_day1_2 {
	private static Scanner a;

	public  static void main(String arg[])
	{
		a = new Scanner(System.in);
		System.out.println("��������x��y");
		int x=a.nextInt();
		int y=a.nextInt();
		System.out.print("x+y="+(x+y));
	}
}
