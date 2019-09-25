package Base;
import java.util.Scanner;
//从键盘输入一个人的年龄和性别，判断这个人是否符合退休年龄。（男退休年龄为65岁，女退休年龄为60岁）。并打印出这个人的信息。
public class practice_day1_6 {
	private static Scanner a2;
	public static void main(String args[])
	{
		while(true) {
		System.out.println("请依次输入年龄和性别：");
		a2 = new Scanner(System.in);
		int ia=a2.nextInt();
		String ib=a2.next();
		if((ia>=65&&ib.equals("男"))||(ia>=60&&ib.equals("女"))) {
			
			System.out.println("已到退休年龄");
			System.out.println("年龄:"+ia);
			System.out.println("性别:"+ib);

		}else {
			System.out.println("未到退休年龄");
			System.out.println("年龄:"+ia);
			System.out.println("性别:"+ib);		}
		}
	}
}
