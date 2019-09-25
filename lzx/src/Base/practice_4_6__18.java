package Base;
//题目：输出9*9口诀。  
public class practice_4_6__18 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=i;j<=9;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+"  ");
			}
			System.out.println(" ");
		}
	}
}
