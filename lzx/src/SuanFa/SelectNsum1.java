package SuanFa;

import java.util.Scanner;
public class SelectNsum1 {
	public static void main(String[] args) {
		long count=0;//������¼��1���ĸ���
		Scanner input=new Scanner(System.in);
		System.out.println("����������n��");
		long n=input.nextLong();//��������n
		for(long i=1;i<=n;i++) {//forѭ������1��n
			String s=String.valueOf(i);//����������iת��Ϊ�ַ���
			for(int j=0;j<s.length();j++) {//��ȡ�ַ����ĳ��ȣ�ѭ������
				char s2=s.charAt(j);//��ȡ��ǰλ�õ�����
				if(s2=='1') {//�ж��Ƿ�Ϊ��1����Ϊ 1��count+1
					count=count+1;
				}
			}			
		}
		System.out.println("1��"+n+"��"+count+"��1��");//ѭ��������ӡ���	
		input.close();
	}	
}
