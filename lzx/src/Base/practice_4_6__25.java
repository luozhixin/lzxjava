package Base;
//25.��Ŀ�����õݹ鷽����5!��   
public class practice_4_6__25 {

	public static void main(String[] args)
	{
		System.out.println("5!="+result(5));
		}
	public static int result(int n)
	{
		if(n!=1)
		{
			return n*result(n-1);
			}	
			
	return 1;
}
}
