package StringType;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork0429 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		//1�����ַ���
				System.out.println("��һ��:");
				System.out.println("������һ�仰��");
				String str1=input.nextLine();
				System.out.println("��������Ҫ�����ҵ��ַ���");
				String selectstr=input.nextLine();
				int num1=0;
				int sum=0;
				for(int i=0;i<str1.length();i++) {
					int s=str1.indexOf(selectstr,num1);
					if(s>=0) {sum++;}
					if(s<0) {break;}
					num1=s+1;
				}
				System.out.println("��"+str1+"��"+"�е�"+"��"+selectstr+"��"+"����"+sum+"��");
				
		//2ת���ַ���
		System.out.println("�ڶ���:");
		System.out.print("�������ַ���:");
		String str2=input.nextLine();
		str2=str2.replaceAll(" +"," ");
		System.out.println("ɾ������ո�"+str2);
	    String[] s1=str2.split(" ");
	    System.out.println(Arrays.toString(s1));
	    System.out.print("����ĸ��д:");
		for(int j=0;j<s1.length;j++) {
			
			String s2=s1[j].substring(0, 1).toUpperCase()+s1[j].substring(1).toLowerCase();
			
			System.out.print(s2+" ");
		}
		
		//3����һ����Ʒ�ļ۸񣬲��Ұ���Ҫ��ÿ��λ��֮����϶��Ÿ�����
		System.out.println();
		System.out.println("������:");
		System.out.println("����۸�");
		String num=input.next();
		StringBuffer str3 = new StringBuffer(num);
		for(int i=str3.length()-3;i>0;i=i-3) {
			str3.insert(i, ",");
		}
		System.out.println(str3);
		//4ʹ��String Buffer��ʵ����������༭һ������ѭ�����ռ���������ַ���������������ַ���bye��ʱ�����
		//�������Ǽ���������ַ�����100����ʱ��Ҳ���������ս����е��ַ�ʹ�ÿո�ʹ�ö��Ž����滻������ո�ֻ��һ��
		//���ţ����ҽ������ַ��е����硰Ѿ�ġ�������Ӵ������sb��,������� ʹ��**�滻����������ַ������
		System.out.println("������:");
		StringBuffer sb = new StringBuffer();
		while(true){
			String str4 = input.nextLine();
			if(str4.equals("bye")){
				break;
			}
			sb.append(str4);
			if(sb.length()>=100){
				break;
			}
		}
		String str5 = new String(sb); 
		str5=str5.replaceAll(" +",",");
		str5=str5.replaceAll("Ѿ��", "**");
		str5=str5.replaceAll("��Ӵ", "**");
		str5=str5.replaceAll("sb", "**");
		str5=str5.replaceAll("���", "**");
		System.out.println(str5);
		
	}

}
