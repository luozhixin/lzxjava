package Base;
import java.util.Scanner;
public class practice_4_6__1 {
private static Scanner a;
//1.��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��   
public static void main(String args[]) {
	while(true) {
	System.out.println("������ɼ���");
	a = new Scanner(System.in);
	int x=a.nextInt();
	if(x>=90)
	{
		System.out.println("�ɼ��ȼ�ΪA");
	}
	if(x<=59)
	{
		System.out.println("�ɼ��ȼ�ΪC");
	}
	if(x>=60&&x<=89)
	{
		System.out.println("�ɼ��ȼ�ΪB");
	}
	}
}
}
