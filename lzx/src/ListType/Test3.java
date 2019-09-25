package ListType;
//打印出杨辉三角形


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr5=new int[10];
		arr5[0]=1;
		for(int i=0;i<=9;i++){
			for(int j=i;j>=1;j--){
			arr5[j]=arr5[j]+arr5[j-1];	
			}
			for(int k=0;k<=i;k++){
				System.out.print(arr5[k]+" ");
			}
			System.out.println();
		}
		
	}
	

}
