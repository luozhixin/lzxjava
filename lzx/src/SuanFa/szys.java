package SuanFa;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

    public class szys {
        public static void main(String[] args) {
            String expression = "10+((2+3)*4)-5";
            //��"1+((2+3)*4)-5"ת��[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
            //��[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]ת�ɳɺ�׺���ʽ[10, 2, 3, +, 4, *, +, 5, -] =
            List<String> list1  = expressionTolist(expression);
            List<String> list2  = parsesuffixExpressionlist(list1);
            System.out.println(list1 + "================");
            System.out.println(list2 + "=list2");
            System.out.println(caculate(list2));
        }
        //��׺���ʽlistת�ɺ�׺���ʽ��arrayList
        public static List<String> parsesuffixExpressionlist(List<String> ls){
            //��������ջ
            Stack<String> s1 = new Stack<String>();  //����ջ
            //stack2���ջû��pop�������������Ҫ������ܵõ��沨�����ʽ�����Բ���arraylis����
            List<String> s2 = new ArrayList<String>();
            //����ls  ��ȡ��ÿһ���ַ�
            for (String item : ls) {
                if(item.matches("\\d+")) { //�����һ���� ֱ�Ӽ���s2
                    s2.add(item);
                }else if(item.equals("(")) { //�����"("�� ֱ��ѹ��s1
                    s1.push(item);
                }else if(item.equals(")")) { //�����")"�������ε���s1ջ���������ֱ������������Ϊֹ����ʱ����һ�����Ŷ���
                    while(!s1.peek().equals("(")) {
                        s2.add(s1.pop());
                    }
                    s1.pop();  //��"("����
                }else {  //�����  ��item�����ȼ���s1ջ���Ƚ�
                    while(s1.size() != 0 && Operation.priorty(s1.peek()) >= Operation.priorty(item) ) {
                        s2.add(s1.pop());
                    }
                    //�� itemѹ��ջ��
                    s1.push(item);
                }
                System.out.println(s2);
                System.out.println(s1);
            }
            //�� s1��ʣ��������ѹ��s2 ��
            while(s1.size()!= 0) {
                s2.add(s1.pop());
            }
            return s2;//��Ϊ s2������һ�������ʴ˰�����������沨�����ʽ
        }
        //����׺���ʽת����list
        public static List<String> expressionTolist(String str){
            List<String> list = new ArrayList<String>();
            int i = 0;  // ����
            String s;  //��λ����ƴ��
            do {
                s = "";  // �˴�һ��Ҫʹ s Ϊ�մ�����������������������������������
                //�����һ�������֣�ֱ�Ӽ��뵽list
                if(str.charAt(i) < 48 || str.charAt(i) > 57) {
                    list.add(str.charAt(i) + "");
                    i ++;
                }else {  //��������ֿ��Ƕ�λ��������
                    while(i < str.length() && str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                        s = s + str.charAt(i);  //ƴ��
                        i++;
                    }
                    list.add(s);
                }
            }while( i < str.length());
            return list;
        }
        public static int caculate(List<String> list) {
            Stack<String> stack = new Stack<String>();
            //����list
            for (String string : list) {
                if(string.matches("\\d+")) {
                    //��ջ
                    stack.push(string);
                }else {
                    //pop�����������������㣬�������push��ջ
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
                        throw new RuntimeException("������쳣");
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
        //�������㼰������˳��
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
                System.out.println("�����ڸ������");
            }
            return res;
        }

    }


