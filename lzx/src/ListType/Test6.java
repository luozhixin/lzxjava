package ListType;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr4=new int[10][30];
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=29;j++) {
				arr4[i][j]=(int)(Math.random()*(101-0)+0);
			}
		}
		int min=arr4[0][0];
		int max=arr4[0][0];
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4.length;j++) {
				if(arr4[i][j]>=max)
				{
					max=arr4[i][j];
				}
				if(min>arr4[i][j])
				{
					min=arr4[i][j];
				}
				
			}
		}
		
		for(int k=0;k<10;k++) {
		System.out.println(Arrays.toString(arr4[k]));}
		int sum3=0;
		for(int i=0;i<=9;i++) {
			float sum=0;
			int  sum1=0;
			for(int j=0;j<=29;j++) {
				sum+=arr4[i][j];
				if(arr4[i][j]>80){
					sum1++;
				}
			}
			sum3+=sum1;
			System.out.println((i+1)+"���ƽ�����ǣ�"+(sum/30)+"            ����80�ֵ���"+sum1+"��");
		}
		System.out.println();
		System.out.println("ȫУ����80�ֵ���"+sum3+"��");
		System.out.println();
		System.out.println("ȫУ��ͷ֣�"+min);
		System.out.println();
		System.out.println("ȫУ��߷֣�"+max);
	}

}
