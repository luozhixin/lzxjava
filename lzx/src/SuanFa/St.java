package SuanFa;

import java.util.Arrays;

public class St {
	public static void main(String[] args) {
		String str=new  String("  We      Are Happy.    ");
		System.out.println("1�ж��Ƿ�Ϊ�գ�����true/false��"+str.isEmpty());		
		System.out.println("2�ж��Ƿ��������ֵ�����ط���true/false��"+str.contains("W"));
		System.out.println("3��ȡ�ַ���ָ���ַ����ַ����е�λ�ã�Ĭ�ϴ�0��ʼ���ң�"+str.indexOf("W"));
		System.out.println("4��ȡ�ַ���ָ��λ�ô�������ֵ���˴���ʾ��"+str.charAt(0)+"��"+str.charAt(1));
		System.out.println("5��ȡ�ַ���ָ���ַ����ַ����е�λ��,9�����λ��9��ʼ�������粻���ڷ���-1��"+str.indexOf("W", 9));
		System.out.println("6��ȡ�ַ���ָ���ַ����ַ����������ֵ�λ�ã�"+str.lastIndexOf("p"));
		System.out.println("7��ȡ�ַ����ĳ��ȣ�"+str.length());
		System.out.println("8��һ�������ո��滻��%20��"+str.replaceAll(" +","%20"));
		System.out.println("9���ַ�����ΪСд��"+str.toLowerCase());
		System.out.println("10���ַ�����Ϊ��д��"+str.toUpperCase());
		System.out.println("11���ַ����Կո�Ϊ�ڵ�ָ�Ϊһ�����飺"+Arrays.toString(str.split(" +")));
		System.out.println("12ȥ���ַ������˿ո�"+str.trim());	
	}
}	
