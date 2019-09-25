package Base;

public class Homework7 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("1~10之间的所有偶数和 为："+sum);
	}

	}
