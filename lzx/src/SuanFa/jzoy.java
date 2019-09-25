package SuanFa;
import java.util.LinkedList;

public class jzoy {
	public static void main(String[] args) {
		int a[]= {2,35,52,1,5,3,44,55,33,2,1,10};
		sort(a); 
	}
	static void sort(int [] a) {
		
		LinkedList<Integer> p=new LinkedList<Integer>();		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				p.add(a[i]);
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				p.add(a[i]);
			}			
		}
		System.out.println(p);
	}
}
