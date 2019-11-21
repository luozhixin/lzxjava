package SuanFa;import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    ��Ŀ�������������ʽ���ó�����������
    * ע�⣺<br>
        1������Ϊ�ַ������ͣ���������������λС����<br>
        2��������ַ����п��ܺ������š�<br>
        3�������ֻ�У���+ - * / ( )������
 */
public class DemoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��������ʽ��");
        String str = sc.nextLine();
        // ȥ���ַ����еĿո�table�ȿհ��ַ�
        str = str.replaceAll("\\s*", "");
        // �������㷽��
        System.out.println(getCalculatorAll(str));
    }
    /**
     * ���������㷽��
     *
     * @param str �������ʽ
     * @return ����������
     */
    private static String getCalculatorAll(String str) {
        // Ѱ�������ţ�lastIndexOf��������-1�������ַ�����û�и��Ӵ�
        // ���򷵻����һ�γ��ֵ�����λ��
        int lindex = str.lastIndexOf("(");
        // lindexΪ-1��˵��������������
        if (lindex == -1) {
            // �ж������ŵĴ��ڣ���������Ŵ��ڣ������ʽ�������׳��쳣
            if (str.indexOf(")") != -1) {
                throw new RuntimeException("�������ʽ��������������");
            }
            // û�������Ŵ��ڣ�ʽ���������������������㷽��
            return getCalculator(str);
        }
        // �����Ŵ���
        else {
            // Ѱ�������ţ�indexOf������������ڸ��Ӵ������ص�һ�γ��ֵ����������򷵻�-1
            int rindex = str.indexOf(")");
            // �����Ŵ��ڣ��������Ų����ڣ����������׳��쳣
            if (rindex == -1) {
                throw new RuntimeException("�������ʽ��������������");
            }
            // ʽ������
            else {
                // ��ȡ�����ڵ����ַ���
                String sub = str.substring(lindex + 1, rindex);
                // �ø��Ӵ��������������㷽��ֱ�����㣬���ص�������Ľ��
                String result = getCalculator(sub);
                // �������ڵ����ַ����������ö����ţ��滻Ϊ����Ľ��
                str = str.substring(0, lindex) + result + str.substring(rindex + 1);
                // �ݹ����
                return getCalculatorAll(str);
            }
        }
    }
    /**
     * ���������㷽��
     *
     * @param str �������ʽ
     * @return ������
     */
    private static String getCalculator(String str) {
        // ��ȡ�������ʽ�е������б�
        List<Double> numlist = getNumberList(str);
        // ��ȡ�������ʽ�е�������б�
        List<Character> operlist = getOperList(str);
        // ���ȼ���˳�������������б�������ڳ˳�����������
        for (int i = 0; i < operlist.size(); i++) {
            Character oper = operlist.get(i);
            // ���ڳ˳������
            if (oper == '*' || oper == '/') {
                // Ҫʹ�ø������������Ӧ��������󽫸��������operlist�б����Ƴ�
                operlist.remove(i);
                // ȡ����������������ߵĲμ����������
                // ��һ����������Ķ��������������operlist�е�����λ��һ��
                // ��ȡi����λ�õ����ݣ�remove�����Ƿ���i����λ�õ�ֵ��ͬʱ���б���ɾ��������λ�õ�Ԫ��
                double lnum = numlist.remove(i);
                // �ڶ�������ԭ����λ��Ӧ��������Ϊi+1��λ�ã����ǵ�һ��������remove������i֮���Ԫ�ض�Ҫ�����ƶ�һλ�����Ի���removeȡ��i����λ�õ�Ԫ��
                double rnum = numlist.remove(i);
                // ������֮���ֵ���������iλ�ã��滻���������ʽ��
                numlist.add(i, oper == '*' ? lnum * rnum : lnum / rnum);
                // ���ڵ�operlist��i����λ�õ��������ԭ��i+1���ģ�����Ҫi--���ø�������������
                i--;
            }
        }
        // ÿһ�ε����㶼��Ҫʹ��һ������������������б�Ϊ�գ�˵������δ�����������������
        // ��ʱʣ�µ������ֻ�мӼ�����������Կ��Դ�����˳������
        while (!operlist.isEmpty()) {
            double lnum = numlist.remove(0);
            double rnum = numlist.remove(0);
            Character oper = operlist.remove(0);
            numlist.add(0, oper == '+' ? lnum + rnum : lnum - rnum);
        }
        // numlist.get(0)����Ϊ���㵽���ֻ��0����������������Ľ��
        // ʹ��String���format��������Ϊ�˹淶��ʽ
        return String.format("%.2f", numlist.get(0));
    }
    /**
     * ��ȡ������б�
     *
     * @param str ��ʽ
     * @return ����������б�
     */
    private static List<Character> getOperList(String str) {
        // ��������ַ�������ǰ��ĸ��ţ���-���滻Ϊ��@��
        str = setSymbol(str);
        List<Character> operlist = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char oper = str.charAt(i);
            if (oper == '+' || oper == '-' || oper == '*' || oper == '/') {
                operlist.add(oper);
            }
        }
        return operlist;
    }
    /**
     * ��ȡ���������б�
     *
     * @param str ��ʽ
     * @return �����������б�
     */
    private static List<Double> getNumberList(String str) {
        // ��������ַ�������ǰ��ĸ��ţ���-���滻Ϊ��@��
        str = setSymbol(str);
        // ��������滻Ϊ��#������Ϊ����һ���ĸ��ݡ�#���ָ�
        str = str.replace("+", "#");
        str = str.replace("-", "#");
        str = str.replace("*", "#");
        str = str.replace("/", "#");
        // ���ݡ�#���ָ��ַ������õ��������б�
        String[] num = str.split("#");
        List<Double> numlist = new ArrayList<>();
        // ���ָ����ַ�������ʹ��Double��װ���parseDouble������ת��ΪDouble��������
        for (String s : num) {
            // ����ַ����ĵ�һ���ַ�Ϊ��@���������Ǹ�������ʱҪ����@���滻�ء�-��
            if (s.charAt(0) == '@') {
                s = '-' + s.substring(1);
            }
            // Double��װ���parseDouble���������ַ���ת��ΪDouble���ͣ�����������б���
            numlist.add(Double.parseDouble(s));
        }
        return numlist;
    }
    /**
     * ��������ַ�������ǰ��ĸ��ţ���-���滻Ϊ��@��
     *
     * @param str ����ʽ
     * @return ���ؽ�����ǰ�ĸ��š�-���滻Ϊ��@��֮����ַ���
     */
    private static String setSymbol(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // ����ַ��Ǹ���
            if (ch == '-') {
                // ������ַ��������ǵ�һ������0�����������һ�������Ǹ���
                if (i == 0) {
                    str = '@' + str.substring(1);
                } else {
                    char ch2 = str.charAt(i - 1);
                    // ������ŵ�ǰ�滹���������������˵�����������ʾ����ǰ�ĸ���
                    if (ch2 == '+' || ch2 == '-' || ch2 == '*' || ch2 == '/') {
                        str = str.substring(0, i) + '@' + str.substring(i + 1);
                    }
                }
            }
        }
        return str;
    }
}
