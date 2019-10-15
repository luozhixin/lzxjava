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
        if (s.isEmpty()){//判断字符串是否为空
         return 0;
        }else{//不为空
            int max=1;//从第一个字符开始，假设1就为最大值
            int sum=1;
            String s1=""+s.charAt(0);//获取字符串中第一个字符，将其作为flag
            if(s.length()==1){
                return 1;//判断字符串长度是否为1，为1直接返回1
            }//真的，我想通了。从幼儿园到到当年高中毕业，男生和女生关系最好的一段时光竟然是在幼儿园，但慢慢地男生和女生就会分成两个群体，这件事是从什么时候开始的呢？
//
            for (int i = 1; i < s.length(); i++) {//从第二个字符开始遍历
                if(s1.indexOf(""+s.charAt(i))!=-1){//判断flag字符中是否还有下一个字符
                    int n1=s1.length()-s1.indexOf(""+s.charAt(i))-1;//找到flag字符中含有下一个字符的位置,并截取其后字符的长度
                    sum=n1+1;
                    s1=s1.substring(s1.indexOf(""+s.charAt(i))+1,s1.length())+s.charAt(i);//截取原flag其后字符并加上末端的重复字符形成新的flag字符
                }else{
                    sum=sum+1;//flag字符中没有有下一个字符，sum+1并在flag字符中加上下一个字符
                    s1=s1+s.charAt(i);
                }
                if(sum>max){//当sum>max,替换max
                    max=sum;
                }
            }
            return max;
        }

    }
}
