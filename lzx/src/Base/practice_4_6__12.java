package Base;
import java.util.Scanner;
//��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ� 
public class practice_4_6__12 {
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("�����������");
		s = new Scanner(System.in);
		int m=s.nextInt();
		int sum=0;
		int sum1=0;
		int a=(int)(Math.random()*(10-1)+1);
		for(int i=0;i<m;i++)
		{
			sum=sum*10+a;
			sum1=sum1+sum;
		}
		System.out.println("��������Ϊ��"+a);
		System.out.print(a+"+");
		System.out.println(a+"...="+sum1);
        }
}
