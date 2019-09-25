package Base;
import java.util.Scanner;
//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
public class practice_4_6__10 {
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("请输入带分解正整数：");
		s = new Scanner(System.in);
		int w=s.nextInt();
		int c=0;
		System.out.print("分解结果为："+w+"=");
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
