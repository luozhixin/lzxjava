package Base;
import java.util.Scanner;
//ͨ��������������С����Ȼ���ӡ���������ݵĲ
public class practice_day1_3 {
	private static Scanner a;

	public  static void main(String arg[])
	{
		a = new Scanner(System.in);
		System.out.println("��������x��y");
		float x=a.nextFloat();
		float y=a.nextFloat();
		System.out.print("x-y="+(x-y));
	}
}
