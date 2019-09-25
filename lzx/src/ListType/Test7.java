package ListType;


import java.util.Arrays;

public class Test7 {
	static int num2;
	public static void swap(String[] arr, int i, int j) {
		if (i == j) {
			return;
		}
		String temp=arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
 
	public static void shuffleSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int j = (int) (arr.length * Math.random());
			swap(arr, i, j);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr={"A","A","A","A","2","2","2","2","3","3","3","3",
				       "4","4","4","4","5","5","5","5","6","6","6","6",
				       "7","7","7","7","8","8","8","8","9","9","9","9",
				       "10","10","10","10","J","J","J","J","Q","Q","Q","Q",
				       "K","K","K","K","大王","小王"};
		String [] arr1=new String[17]; 
		String [] arr2=new String[17]; 
		String [] arr3=new String[20]; 

		System.out.println("原序"+Arrays.toString(arr));
		shuffleSort(arr);
		System.out.println("打乱"+Arrays.toString(arr));
		
		for(int i=0;i<17;i++){
			arr1[i]=arr[i];
		}
		
		for(int i=0;i<17;i++){
			arr2[i]=arr[i+17];
		}
		for(int i=0;i<20;i++){
			arr3[i]=arr[i+17+17];
		}
		System.out.println("甲："+Arrays.toString(arr1));
		System.out.println("乙："+Arrays.toString(arr2));
		System.out.println("丙："+Arrays.toString(arr3));
		
		chongfu(arr1,arr1.length);
		System.out.println("炸弹数："+num2/4);
		chongfu(arr2,arr2.length);
		System.out.println("炸弹数："+num2/4);
		chongfu(arr3,arr3.length);
		System.out.println("炸弹数："+num2/4);
		
	}

	public static void chongfu(String[] arr, int length) {
		int num=0;
		num2=num;
		String c="大王";
		String b="小王";
		int k=0 ;
		for(int i=0;i<length;i++){	
			String a=arr[i];
		    if(a.equals(b))
		    {k=k+1;
		   
		    }
		    if(a.equals(c))
		    {
		    	k=k+1;
		    	
		    	}
			int num1=0;
			for(int j=0;j<length;j++){
			
				if(a.equals(arr[j])){
					num1++;
				}
				
				
			}
			if(num1==4){
				num++;
				
			}
			if(k==2){
				
				num=num+4;
				k=0;
			}
		}
	
		k=0;
		num2=num;
	}
}
