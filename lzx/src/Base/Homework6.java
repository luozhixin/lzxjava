package Base;
import java.util.Scanner;
public class Homework6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int num=input.nextInt();
		float sum=0;
		for(int i=1;i<=num;i++){
			System.out.println("������java���е�"+i+"��ѧ���ĳɼ�:");
			int grade=input.nextInt();
			if(grade>=80){
				sum++;
			}
		}
		System.out.println("�������ڵ��� 80�ֵ�ѧ������Ϊ��"+(sum/num)+"%");
	}

}
