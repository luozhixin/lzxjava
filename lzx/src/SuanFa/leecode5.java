package SuanFa;

import java.util.Date;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/14 16:17
 * @Description:
 */
public class leecode5 {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
          Long startTime = (new Date()).getTime();

//        if(s.equals("")){
//            return "";
//        }
//        if (s==null){
//            return null;
//        }
//        StringBuffer sb;
//        String s2 = "";
//        int num=0;
//        int max=0;
//        for (int i = 0; i < s.length() ; i++) {
//            for (int j = i; j < s.length(); j++) {
//                boolean g=true;
//                String s3=s.substring(i,j+1);
//                int l3=s3.length();
//                for (int k = 0; k < l3; k++) {
//                    if(s3.charAt(k)!=s3.charAt(l3-1-k)){
//                        g=false;
//                        break;
//                    }
//                }
//                if(g){
//                    num=j+1-i;
//                    if(num>max){
//                        max=num;
//                        s2=s.substring(i,j+1);
//                    }
//                }
//            }
//        }
//    System.out.println("ºÄÊ±"+ ((new Date()).getTime()-startTime));
//
//        return s2;



            int l=s.length();
            if(s.equals("")){
                return "";
            }
            if (s==null){
                return null;
            }
            StringBuffer sb;
            String s2 = "";
            int num=0;
            int max=0;
            for (int i = 0; i < l ; i++) {
                for (int j = i; j < l; j++) {
                    boolean g=true;
                    String s3=s.substring(i,j+1);

                    int l3=s3.length();
                    for (int k = 0; k < l3; k++) {
                        if(s3.charAt(k)!=s3.charAt(l3-1-k)){
                            g=false;
                            break;
                        }
                    }
                    if(g){
                        num=j+1-i;
                        if(num>max){
                            max=num;
                            s2=s3;
                        }
                    }
                }
                if(max==l){
                    break;
                }
            }
            System.out.println("ºÄÊ±"+ ((new Date()).getTime()-startTime));
            return s2;





//        if(s.equals("")){
//            return "";
//        }
//        if (s==null){
//            return null;
//        }
//        String s2 = "";
//        int num=0;
//        int max=0;
//        for (int i = 0; i < s.length() ; i++) {
//            for (int j = i; j < s.length(); j++) {
//                StringBuffer sb=new StringBuffer(s.substring(i,j+1));
//                sb=sb.reverse();
//                String s1=new String(sb);
//                if(s1.equals(s.substring(i,j+1))){
//                    num=j+1-i;
//                    if(num>max){
//                        max=num;
//                        s2=s1;
//                    }
//                }
//            }
//        }
//        return s2;
    }
}
