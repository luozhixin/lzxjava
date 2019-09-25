package Base;
import java.util.Scanner;
//工程师要控制一个硬件，这个硬件需要写入一个32位的数据，已经从硬件手册上面查询到。第31位为1时，可以控制指示灯点亮，第15位为1时，控制流水阀工作，第11位为1时，整个机器主要功能启动。现在我们要是用该机器：需要指示灯点亮，流水阀工作，机器主要功能启动：请你为我们构建这一个数据，并将这个数据的值打印出来。
public class practice_day1_7 {
	private static Scanner a;

	public static void main(String args[])
	{
	

		while(true) {
		System.out.println("输入1获得满足条件的随机数");
		a = new Scanner(System.in);
		int ia=a.nextInt();
		int[] f=new int[32];
		if(ia==1){
			for(int i=0;i<32;i++)
			{
				if(i==10||i==14||i==30)
				{
					f[i]=1;
				}else {
					f[i]=(int)(Math.random()*(2-0)+0);
				}
			}
			
			for(int x=0;x<32;x++)
			{
				System.out.print(f[x]);
			}
		}
		System.out.println();
		}
	}


}
