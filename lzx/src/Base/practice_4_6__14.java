package Base;
//14.��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�������   ��10�����ʱ�������������ף���10�η�����ߣ� 
public class practice_4_6__14 {
	public static void main(String args[])
	{
		float a=100;
		float sum=0;
		System.out.println("1000���ڵ������У�");
		for( int j=0;j<10;j++)
		{
			a=a/2;
			sum=sum+a;
		}
		System.out.println("��10�����ʱ������"+sum+"��");
		System.out.println("��10�η���"+a+"��");
	}
}
