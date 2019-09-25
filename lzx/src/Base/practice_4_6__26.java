package Base;
//26.题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？   
   
public class practice_4_6__26 {
	public static void main(String[] args)
	{
		int a=0; 
		for(double i=4;i<10000;i=i+4) {
			double k=0;
			k=i;
			qqq:while(a<=4)
			{
				k=k*1.25+1;
				a++;
				if(k-(int)k!=0) { a=0;break qqq;}
			}
			if(a==5) 
			{
				System.out.println("海滩上原来最少有"+(int)k+"个桃子");
			break;
			}
		}
		
		}
}
