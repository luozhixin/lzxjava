package SuanFa;

public class arrmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,9,-52,-1,5,3,52,-55,33,2,1,10};
		System.out.println("max="+max(a));
		
	}
	static int max(int [] array) {
		int max = array[0];
        int sum = 0;
		if (array.length == 0) {
            return 0;
        }       
        for(int i=0; i<array.length; i++){             
            if(sum >= 0) { 
                sum += array[i];  
            }
            else{  
                sum = array[i];
            }
            if(sum > max){  
                max = sum;  
                System.out.println("max="+max);
            }
        }  
        return max;  
    }
	
}
