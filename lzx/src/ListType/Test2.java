package ListType;
//ѭ��¼��һ����10��ѧ���İ༶�ɼ�������༶�����ƽ���֡���߷֡���ͷ֡��Լ�����༶�гɼ�����80�ֵ������������


import java.util.Scanner;

public class Test2 {
	public static void main(String[] args ) {
		int [] arr1=new int [10];
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int max,min,sum=0,sum1=0;
		for (int i=0;i<=9;i++) {
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ���");
			arr1[i]=input.nextInt();
			sum=sum+arr1[i];
			if(arr1[i]>80) {
				sum1++;
			}
			
		}
		max=arr1[0];
		min=max;
		for (int i=1;i<=9;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
			}	
			if(arr1[i]<min) {
				min=arr1[i];
			}	
			
		}
		
		System.out.println("��߷֣�"+max);
		System.out.println("��ͷ֣�"+min);
		System.out.println("ƽ���֣�"+(sum/10));
		System.out.println("����80��������"+sum1);

	}

}
