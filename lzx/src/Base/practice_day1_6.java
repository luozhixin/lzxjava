package Base;
import java.util.Scanner;
//�Ӽ�������һ���˵�������Ա��ж�������Ƿ�����������䡣������������Ϊ65�꣬Ů��������Ϊ60�꣩������ӡ������˵���Ϣ��
public class practice_day1_6 {
	private static Scanner a2;
	public static void main(String args[])
	{
		while(true) {
		System.out.println("����������������Ա�");
		a2 = new Scanner(System.in);
		int ia=a2.nextInt();
		String ib=a2.next();
		if((ia>=65&&ib.equals("��"))||(ia>=60&&ib.equals("Ů"))) {
			
			System.out.println("�ѵ���������");
			System.out.println("����:"+ia);
			System.out.println("�Ա�:"+ib);

		}else {
			System.out.println("δ����������");
			System.out.println("����:"+ia);
			System.out.println("�Ա�:"+ib);		}
		}
	}
}
