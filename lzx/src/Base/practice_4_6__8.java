package Base;
//8.��Ŀ���ж�101-200֮���ж��ٸ����������������������   
public class practice_4_6__8 {
public static void main(String args[])
{
	int y=0;
	System.out.println("101��200�������У�");
	for(int i=101;i<=200;i++)
	{
		int x=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				x=x+1;
			}
		}
		if(x==0)
		{
			System.out.println(i);
			y=y+1;
		}
	}
	System.out.println("�ܹ�"+y+"��");
	}
}
