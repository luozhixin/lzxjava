package Base;
//17. ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
public class practice_4_6__17 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int  k;
		double sum=0;
		System.out.print("ǰ20��֮�ͣ�");
		for(int i=0;i<20;i++)
		{
			k=a;
			a=a+b;
			b=k;
			sum=sum+a/b;
			System.out.print(a+"/"+b);
			if(i<19)
			{			
				System.out.print("+");
			}
		}
		System.out.print("="+sum);
}
}
