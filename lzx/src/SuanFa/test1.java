package SuanFa;
import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class test1{
	public static void main(String[] args){

		System.out.println(dosomething1(-1261111459));
	}
	public static int  dosomething1(int num){
		long l=0L;
	while (num/10!=0||num%10!=0){
		l=l*10+num%10;
		System.out.println("lµÄÖµ£º"+l);
		num=num/10;
	}
	if(l>Integer.MAX_VALUE||l<Integer.MIN_VALUE){
		return 0;
	}else{
		return (int) l;
	}
	}
}