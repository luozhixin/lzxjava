package SuanFa;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    String str_input;
    public static void main(String[] args){
         Main m = new Main();
          m.input();
          m.cal();
    }
   public void input(){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
        str_input = sc.nextLine();
    }
    public void cal(){
        Stack<Character> stack = new Stack<>();
        String result = "(";
        char[] c = str_input.toCharArray();
        for(int i = 1; i < c.length - 1; i ++){
            if(c[i] == '('){
                stack.push(c[i]);
            }
            else if(c[i] == ')'){
                if(!stack.empty()){
                    stack.pop();
                }
                else{
                	System.out.println("格式有误");
                }
            }
            else{
                result += c[i];
            }
        }
        if(!(stack.isEmpty())){
        		System.out.println("格式有误");
        	}
        else{
            result += ')';
            System.out.println(result);
            
        }
        
    }
    
}