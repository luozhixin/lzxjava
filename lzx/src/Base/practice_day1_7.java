package Base;
import java.util.Scanner;
//����ʦҪ����һ��Ӳ�������Ӳ����Ҫд��һ��32λ�����ݣ��Ѿ���Ӳ���ֲ������ѯ������31λΪ1ʱ�����Կ���ָʾ�Ƶ�������15λΪ1ʱ��������ˮ����������11λΪ1ʱ������������Ҫ������������������Ҫ���øû�������Ҫָʾ�Ƶ�������ˮ��������������Ҫ��������������Ϊ���ǹ�����һ�����ݣ�����������ݵ�ֵ��ӡ������
public class practice_day1_7 {
	private static Scanner a;

	public static void main(String args[])
	{
	

		while(true) {
		System.out.println("����1������������������");
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
