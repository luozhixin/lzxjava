package Base;
//ͨ�����������Ż������ĳɼ�����ѧ�ɼ���ѧУ��ѡ������ѧ����Ҫ�����ĳɼ�����90�֣���ѧ�ɼ�����95�֡�����Ż��Ƿ������ϡ�����ѧ������

import java.util.Scanner;

public class practice_day1_5 {

private static Scanner a;

public static void main(String args[])
{
	System.out.println("�����������Ż������ĳɼ�����ѧ�ɼ���");
	a = new Scanner(System.in);
	int ia=a.nextInt();
	int ib=a.nextInt();
	if(ia>=90&&ib>=95) {
		
		System.out.println("�Ż��ܱ���Ϊ����ѧ��");
	}else {
	System.out.println("�Ż����ܱ���Ϊ����ѧ��");	
	}
	}
}
