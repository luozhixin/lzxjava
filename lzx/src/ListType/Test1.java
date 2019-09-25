package ListType;

import java.util.Arrays;

public class Test1 {
	//给定一个数组arr1 = {1,6,3,9,10,45,100}，要求利用程序实现数组的倒序，并且将数组输出出来。arr1倒序数组为arr2 = {100,45,10,9,3,6,1}

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
