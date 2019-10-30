package SuanFa;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.LinkedList;
public class test{
	static LinkedList<Integer> arrr=new LinkedList<Integer>();
	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost());
		int [] [] arr= {{1,2,3,5,9},{13,42,4,5,6},{33,31,55,5,2},{33,31,55,5,5},{13,42,4,5,6}};
		//int [] [] arr= {{1,2,3,5},{13,42,4,5},{33,31,55,5},{33,31,55,5}};
		int l=arr.length-1;
		int j=0;
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
    	System.out.println(Arrays.toString(arr[2]));
    	System.out.println(Arrays.toString(arr[3]));
    	System.out.println(Arrays.toString(arr[4]));
		print(arr,l,j);
		if(arr.length%2!=0) {
			
			System.out.print(arr[arr.length/2][arr.length/2]);
			arrr.add(arr[arr.length/2][arr.length/2]);
		}
		System.out.println();
		System.out.println(arrr);
	}
	static void print(int [] [] arr,int l,int j) {
		int k=j;
		int q=j;
		for (; k < l; k++) {
			System.out.print(arr[j][k]+" ");
			arrr.add(arr[j][k]);
		}
		for (; q < l; q++) {
			System.out.print(arr[q][l]+" ");
			arrr.add(arr[q][l]);
		}
		for (int i = 0; i < l-j; i++) {
			System.out.print(arr[l][l-i]+" ");
			arrr.add(arr[l][l-i]);
		}		
		
		for (int i = 0; i < l-j; i++) {
			System.out.print(arr[l-i][j]+" ");
			arrr.add(arr[l-i][j]);
		}
		if(l-1>0) {
		print(arr, l-1,j+1);
		}
	}
}