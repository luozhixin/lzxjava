package SuanFa;
import java.util.Stack;
public class erjinzhi {
	public static void main(String[] args) {
		int num=173;
		er(num);
	}
	static void er(int num) {
		int a;
		Stack<Integer> stack=new Stack<Integer>();
		while(true) {
			a=num%2;
			stack.add(a);
			num=num/2;	
			if(num==0) {
				break;
			}
		}
		System.out.print("173转换为二进制为：");
		while(!stack.empty()) {
			System.out.print(stack.peek());
			stack.pop();
		}		
	}
}
