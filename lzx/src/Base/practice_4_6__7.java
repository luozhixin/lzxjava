package Base;
import java.util.Scanner;
//7.��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�����������һ���·ݣ����µ���������Ϊ���٣�   
public class practice_4_6__7 {
	private static Scanner s;

	public static void main(String[] args) {
		while(true)
		{
System.out.print("�������·ݣ�");
long a=1;
long b=1;
long c;
s = new Scanner(System.in);
long x=s.nextLong();
long d=x;
if(x<3) {System.out.println("��������Ϊ2��");}
if(x>=3) {
	while(true)
	{
		c=b;
		b=a+b;
		a=c;
		x--;
		if(x<3)
		{
			break;
		}
		
	}
System.out.println(d+"�º���������Ϊ"+b+"��");
}
}
}
}
