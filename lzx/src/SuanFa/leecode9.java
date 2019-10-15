package SuanFa;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/15 13:56
 * @Description:
 */
public class leecode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }else{
            int y=x;
            int z=0;
            while(y>0){
                z=y%10+z*10;
                System.out.println(z);
                y=y/10;
            }
            System.out.println(z);
            if(z==x){
                return true;
            }
        }
        return false;
    }
}
