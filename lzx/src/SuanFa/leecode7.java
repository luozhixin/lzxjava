package SuanFa;

import java.util.Date;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/15 11:46
 * @Description:
 */
public class leecode7 {
    public static void main(String[] args) {
        int n=1534200009;
        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        Long startTime = (new Date()).getTime();
        int s=0;
        if(x==0){
            return 0;
        }
        if (x<0){
            s=0-x;
        }else {
            s=x;
        }
        StringBuilder sb=new StringBuilder(""+s);
        sb=sb.reverse();
        while(sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        String s1=new String(sb);
        if(x<0){
            try {
                s=0-Integer.parseInt(s1);
            }catch (Exception e){
                return 0;
            }

        }else{
            try {
                s=Integer.parseInt(s1);
            }catch (Exception e){
                return 0;
            }
        }
        return s;
    }
}
