package Base;
//16.��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�   
public class practice_4_6__16 {
	public static void main(String[] args) {
		int a=0; 
		while(true)
		{
			double x=Math.sqrt(a+100);
			double y=Math.sqrt(a+168);
			if((x-(int)x)==0&&(y-(int)y)==0){
				System.out.println(a);
				break;
			}
			a++;
		}
}
}
