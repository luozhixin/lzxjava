package Base;
//��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
public class practice_4_6__15 {
	public static void main(String args[])
	{
		int sum=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&&i!=k&&j!=k)
					{
						System.out.print(i);
						System.out.print(j);
						System.out.print(k);
						System.out.print("  ");
						sum=sum+1;
					}
				}
			}
		}
		
		System.out.print("��"+sum+"λ");
	}
}
