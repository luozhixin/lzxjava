package Base;
//13.һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.���   �ҳ�1000���ڵ�����������   
public class practice_4_6__13 {
	public static void main(String args[])
	{
		System.out.println("1000���ڵ������У�");
		for( int j=1;j<=1000;j++)
		{
			int sum=0;
		for(int i=1;i<j;i++)
		{
			if(j%i==0)
			{
				sum=sum+i;		
			}
		}
		if(sum==j) {System.out.println(j);}
		}
	}
}