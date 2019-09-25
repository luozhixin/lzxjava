package SuanFa;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a= {{1,2,3,4},{5,7,8,9},{6,8,11,12},{11,16,19,23}};
		int b=4;
		sel(a,b);
	}
	static void sel(int [] [] arr,int num) {
		int a=arr.length-1;
		int b=0;
		int temp=0;
		while(a>=0&&b<=arr.length-1)
		{
			if(num==arr[a][b]) {
				System.out.println("该数组中存在该数！");
				temp++;
				break;
			}
			if(num<arr[a][b]) {
				a--;
			}
			if(num>arr[a][b]) {
				b++;
			}
		}
		if(temp==0) {
			System.out.println("该数组中不存在该数！");
		}
	}
}
