package ListType;

import java.util.Arrays;

public class Test1 {
	//����һ������arr1 = {1,6,3,9,10,45,100}��Ҫ�����ó���ʵ������ĵ��򣬲��ҽ��������������arr1��������Ϊarr2 = {100,45,10,9,3,6,1}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,6,3,9,10,45,100};
		int[] arr2=new int[7];
		for(int i=0;i<=6;i++) {
			arr2[6-i]=arr1[i];	
		}
		System.out.println(Arrays.toString(arr2));

		
	}

}
