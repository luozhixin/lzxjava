package Base;
import java.util.Scanner;
//3.��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
public class practice_4_6__3 {
	private static Scanner s;

	public static void main(String args[]) {
		while(true) {
		System.out.println("������һ����λ����");
		s = new Scanner(System.in);
		int x=s.nextInt();
		int b=x;
		int a=0;
		while(true) 
		{
		a=a*10+x%10;
		x=x/10;
		if(x==0)
		{
			break;
		}
		}
		if(b==a)
		{
			System.out.println("�����ǻ�����");
		}else {
			
			System.out.println("�������ǻ�����");
		}
		}
		
	}
}
