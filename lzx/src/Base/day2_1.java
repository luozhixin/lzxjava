package Base;
import java.util.Scanner;
//��ĳ�Ա������ ��������Ϸ��һ����A��һ����Ա����v����һ����ֵΪ0-100��������
//����һ���ધ��A��ĳ�Ա����v���в¡������������ʾ���˪�С������ʾС�ˡ���������ʾ�²�ɹ���
public class day2_1 {

	public static void main(String[] args) {
		A A=new A();
		@SuppressWarnings("resource")
		Scanner i=new Scanner(System.in);
		first:while(true)
		{
			System.out.println("������²�ֵ��");
			int a=i.nextInt();
			if(a>A.v) {System.out.println("�´��ˣ������ֵ����");}
			if(a<A.v) {System.out.println("�´��ˣ������ֵ��С");}
			if(a==A.v) {System.out.println("��ϲ�㣬�¶���");break first; }
		}
		// TODO Auto-generated method stub


	}

	
}
 class A {

	int v=(int)(Math.random()*(101-0)+0);


}
