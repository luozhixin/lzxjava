package StringType;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork0429 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		//1搜索字符串
				System.out.println("第一题:");
				System.out.println("请输入一句话：");
				String str1=input.nextLine();
				System.out.println("请输入需要，查找的字符：");
				String selectstr=input.nextLine();
				int num1=0;
				int sum=0;
				for(int i=0;i<str1.length();i++) {
					int s=str1.indexOf(selectstr,num1);
					if(s>=0) {sum++;}
					if(s<0) {break;}
					num1=s+1;
				}
				System.out.println("“"+str1+"”"+"中的"+"“"+selectstr+"”"+"共有"+sum+"个");
				
		//2转变字符串
		System.out.println("第二题:");
		System.out.print("请输入字符串:");
		String str2=input.nextLine();
		str2=str2.replaceAll(" +"," ");
		System.out.println("删除多余空格："+str2);
	    String[] s1=str2.split(" ");
	    System.out.println(Arrays.toString(s1));
	    System.out.print("首字母大写:");
		for(int j=0;j<s1.length;j++) {
			
			String s2=s1[j].substring(0, 1).toUpperCase()+s1[j].substring(1).toLowerCase();
			
			System.out.print(s2+" ");
		}
		
		//3输入一个商品的价格，并且按照要求，每三位数之间加上逗号隔开。
		System.out.println();
		System.out.println("第三题:");
		System.out.println("输入价格：");
		String num=input.next();
		StringBuffer str3 = new StringBuffer(num);
		for(int i=str3.length()-3;i>0;i=i-3) {
			str3.insert(i, ",");
		}
		System.out.println(str3);
		//4使用String Buffer类实现下面操作编辑一个程序，循环接收键盘输入的字符，当键盘输入的字符是bye的时候结束
		//，或者是键盘输入的字符超过100个的时候也结束。最终将所有的字符使用空格使用逗号进行替换，多个空格只用一个
		//逗号，并且将所有字符中的诸如“丫的”，“妈哟”，“sb”,”真蠢” 使用**替换。最后将所有字符输出。
		System.out.println("第四题:");
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
		str5=str5.replaceAll("丫的", "**");
		str5=str5.replaceAll("妈哟", "**");
		str5=str5.replaceAll("sb", "**");
		str5=str5.replaceAll("真蠢", "**");
		System.out.println(str5);
		
	}

}
