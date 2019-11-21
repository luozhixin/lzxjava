package SuanFa;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

    public class szys {
        public static void main(String[] args) {
            String expression = "10+((2+3)*4)-5";
            //将"1+((2+3)*4)-5"转成[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
            //将[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]转成成后缀表达式[10, 2, 3, +, 4, *, +, 5, -] =
            List<String> list1  = expressionTolist(expression);
            List<String> list2  = parsesuffixExpressionlist(list1);
            System.out.println(list1 + "================");
            System.out.println(list2 + "=list2");
            System.out.println(caculate(list2));
        }
        //中缀表达式list转成后缀表达式的arrayList
        public static List<String> parsesuffixExpressionlist(List<String> ls){
            //定义两个栈
            Stack<String> s1 = new Stack<String>();  //符号栈
            //stack2这个栈没有pop操作并且最后需要逆序才能得到逆波兰表达式，所以采用arraylis代替
            List<String> s2 = new ArrayList<String>();
            //遍历ls  获取到每一个字符
            for (String item : ls) {
                if(item.matches("\\d+")) { //如果是一个数 直接加入s2
                    s2.add(item);
                }else if(item.equals("(")) { //如果是"("， 直接压入s1
                    s1.push(item);
                }else if(item.equals(")")) { //如果是")"，则依次弹出s1栈的运算符，直到遇到左括号为止，此时将这一对括号丢弃
                    while(!s1.peek().equals("(")) {
                        s2.add(s1.pop());
                    }
                    s1.pop();  //将"("弹出
                }else {  //运算符  将item的优先级和s1栈顶比较
                    while(s1.size() != 0 && Operation.priorty(s1.peek()) >= Operation.priorty(item) ) {
                        s2.add(s1.pop());
                    }
                    //将 item压入栈中
                    s1.push(item);
                }
                System.out.println(s2);
                System.out.println(s1);
            }
            //将 s1中剩余的运算符压入s2 中
            while(s1.size()!= 0) {
                s2.add(s1.pop());
            }
            return s2;//因为 s2本身是一个链表，故此按序输出就是逆波兰表达式
        }
        //将中缀表达式转换成list
        public static List<String> expressionTolist(String str){
            List<String> list = new ArrayList<String>();
            int i = 0;  // 遍历
            String s;  //多位数的拼接
            do {
                s = "";  // 此处一定要使 s 为空串。。。。。。。。。。。。。。。。。
                //如果是一个非数字，直接加入到list
                if(str.charAt(i) < 48 || str.charAt(i) > 57) {
                    list.add(str.charAt(i) + "");
                    i ++;
                }else {  //如果是数字考虑多位数的问题
                    while(i < str.length() && str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                        s = s + str.charAt(i);  //拼接
                        i++;
                    }
                    list.add(s);
                }
            }while( i < str.length());
            return list;
        }
        public static int caculate(List<String> list) {
            Stack<String> stack = new Stack<String>();
            //遍历list
            for (String string : list) {
                if(string.matches("\\d+")) {
                    //入栈
                    stack.push(string);
                }else {
                    //pop出两个数，进行运算，并将结果push进栈
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    int res  = 0;
                    if(string.equals("+")){
                        res =num1 + num2;
                    }else if(string.equals("-")) {
                        res =num2 - num1;
                    }else if(string.equals("*")) {
                        res =num1 * num2;
                    }else if(string.equals("/")){
                        res =num1 / num2;
                    }else {
                        throw new RuntimeException("运算符异常");
                    }
                    stack.push(res + "");
                }
            }
            return Integer.parseInt(stack.pop());
        }

    }
    class Operation{
        private static int ADD = 1;
        private static int SUB = 1;
        private static int MUL = 2;
        private static int DIV = 2;
        //返回运算及的优先顺序
        public static int priorty(String operation) {
            int res = 0;
            if(operation.equals("+") ) {
                res = ADD;
            }else if(operation.equals("-") ) {
                res = SUB;
            }else if(operation.equals("*") ) {
                res = MUL;
            }else if(operation.equals("/") ) {
                res = DIV;
            }else {
                System.out.println("不存在该运算符");
            }
            return res;
        }

    }


