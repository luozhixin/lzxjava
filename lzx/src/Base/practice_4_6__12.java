package Base;
import java.util.Scanner;
//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
public class practice_4_6__12 {
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("请输入个数：");
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
		System.out.println("随机获得数为："+a);
		System.out.print(a+"+");
		System.out.println(a+"...="+sum1);
        }
}
