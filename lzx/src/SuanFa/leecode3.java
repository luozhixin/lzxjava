package SuanFa;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/12 16:03
 * @Description:
 */
public class leecode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){//�ж��ַ����Ƿ�Ϊ��
         return 0;
        }else{//��Ϊ��
            int max=1;//�ӵ�һ���ַ���ʼ������1��Ϊ���ֵ
            int sum=1;
            String s1=""+s.charAt(0);//��ȡ�ַ����е�һ���ַ���������Ϊflag
            if(s.length()==1){
                return 1;//�ж��ַ��������Ƿ�Ϊ1��Ϊ1ֱ�ӷ���1
            }//��ģ�����ͨ�ˡ����׶�԰����������б�ҵ��������Ů����ϵ��õ�һ��ʱ�⾹Ȼ�����׶�԰����������������Ů���ͻ�ֳ�����Ⱥ�壬������Ǵ�ʲôʱ��ʼ���أ�
//
            for (int i = 1; i < s.length(); i++) {//�ӵڶ����ַ���ʼ����
                if(s1.indexOf(""+s.charAt(i))!=-1){//�ж�flag�ַ����Ƿ�����һ���ַ�
                    int n1=s1.length()-s1.indexOf(""+s.charAt(i))-1;//�ҵ�flag�ַ��к�����һ���ַ���λ��,����ȡ����ַ��ĳ���
                    sum=n1+1;
                    s1=s1.substring(s1.indexOf(""+s.charAt(i))+1,s1.length())+s.charAt(i);//��ȡԭflag����ַ�������ĩ�˵��ظ��ַ��γ��µ�flag�ַ�
                }else{
                    sum=sum+1;//flag�ַ���û������һ���ַ���sum+1����flag�ַ��м�����һ���ַ�
                    s1=s1+s.charAt(i);
                }
                if(sum>max){//��sum>max,�滻max
                    max=sum;
                }
            }
            return max;
        }

    }
}
