package Base;
import java.util.Scanner;
//5.��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ���������贫��1234�������Ƕ��٣�

public class practice_4_6__5 {
	private static Scanner s;

	public static void main(String args[]) {
		while(true) {
		System.out.println("�����봫�����ݣ�");
		s = new Scanner(System.in);
		long a=s.nextLong();
		long b,c,d,e;
		b=(a%10+5)%10;
		c=(a/10%10+5)%10;
		d=(a/10/10%10+5)%10;
		e=(a/10/10/10%10+5)%10;
		System.out.print("���ݼ��ܺ�Ϊ��");
		System.out.print(e);
		System.out.print(c);
		System.out.print(d);
		System.out.println(b);
		}
	}
}
