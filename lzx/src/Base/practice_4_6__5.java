package Base;
import java.util.Scanner;
//5.题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。假设传输1234则密文是多少？

public class practice_4_6__5 {
	private static Scanner s;

	public static void main(String args[]) {
		while(true) {
		System.out.println("请输入传输数据：");
		s = new Scanner(System.in);
		long a=s.nextLong();
		long b,c,d,e;
		b=(a%10+5)%10;
		c=(a/10%10+5)%10;
		d=(a/10/10%10+5)%10;
		e=(a/10/10/10%10+5)%10;
		System.out.print("数据加密后为：");
		System.out.print(e);
		System.out.print(c);
		System.out.print(d);
		System.out.println(b);
		}
	}
}
