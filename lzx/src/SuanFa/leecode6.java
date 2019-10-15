package SuanFa;


import java.util.Date;
import java.util.LinkedList;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/15 09:09
 * @Description:
 */
public class leecode6 {
    public static void main(String[] args)  {
        String s = "LEETCODEISHIRINGqwe1";
        System.out.println(convert(s,4));
    }
    public static String convert(String s, int numRows) {
        Long startTime = (new Date()).getTime();
        if (s==null||numRows==0){
            return null;
        }
        int l=s.length();
        int num=2*numRows-2;
        if (l==1||numRows==1){
            return s;
        }
        LinkedList<String>[] linkedLists=new LinkedList[numRows];
        for (int i = 0; i < numRows; i++) {
            linkedLists[i]=new LinkedList<>();
        }
        int x=l/num;
        int y=l%num;
        int q=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < numRows; j++) {
                linkedLists[j].add(String.valueOf(s.charAt(q)));
                q++;
                System.out.println(q);
            }
            for (int j = numRows-2; j > 0; j--) {
                linkedLists[j].add(String.valueOf(s.charAt(q)));
                q++;
                System.out.println(q);
            }
        }
        if(y!=0){
            if(y>=numRows){
            for (int j = 0; j < numRows; j++) {
                linkedLists[j].add(String.valueOf(s.charAt(q)));
                q++;
            }
            for (int j = numRows-2; j > 2*numRows-y-2; j--) {
                linkedLists[j].add(String.valueOf(s.charAt(q)));
                q++;
            }
            }
            if(y<numRows){
                for (int j = 0; j < y; j++) {
                    linkedLists[j].add(String.valueOf(s.charAt(q)));
                    q++;
                }
            }
        }
        String s1="";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < linkedLists[i].size(); j++) {
                s1=s1+linkedLists[i].get(j);
            }
        }
        System.out.println("ºÄÊ±"+ ((new Date()).getTime()-startTime));

        return s1;
    }
}
