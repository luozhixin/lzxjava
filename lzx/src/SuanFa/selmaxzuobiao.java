package SuanFa;

import java.util.Scanner;

public class selmaxzuobiao {
    //能正常运行 但时间复杂度需要优化 它不满足题目规定时间
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        int max=MAx(a,b);
        System.out.println(max);
        int tx=a[max];
        int ty=b[max];
        System.out.println(tx+" "+ty);
    for (int j = 0; j < b.length; j++) {
		 for (int i = 0; i < b.length; i++) {
			if(a[i]>=tx&&b[i]<=ty){
				System.out.println(a[i]+" "+b[i]);
				tx=a[i];
				ty=b[i];
			}
		}

	}
       
    }
    static int MAx(int [] f,int []a){
    	if(a.length==0){
    		return 0;
    	}else{
    		int b=a[0];
    		int c=0;
    	for (int i = 0; i < a.length; i++) {
			if(a[i]>=b){
				b=a[i];
				c=i;
			}
		}
		return c;
		}
    }

}


