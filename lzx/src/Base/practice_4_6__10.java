package Base;
import java.util.Scanner;
//��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
public class practice_4_6__10 {
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("��������ֽ���������");
		s = new Scanner(System.in);
		int w=s.nextInt();
		int c=0;
		System.out.print("�ֽ���Ϊ��"+w+"=");
		for(int i=1;i<=w;i++)
		{
			if(w%i==0&&i>1)
			{
				if(c==0)
				{
					System.out.print(i);
				}else {
					
					System.out.print("*");
					System.out.print(i);
				}
				w=w/i;
				i=1;
				c++;
			}
		}
		}
}
