package ListType;
//书写一个实现使用冒泡法排序数组的函数，并使用输出结果。

import java.util.Arrays;

public class Test4 {
	public static void min(int [] arr1) {
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-1-i;j++) {
				if(arr1[j]>arr1[j+1]) {
				int temp=arr1[j+1];
				arr1[j+1]=arr1[j];
				arr1[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,10,7,5,100,78};
		min(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
