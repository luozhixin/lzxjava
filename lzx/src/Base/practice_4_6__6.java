package Base;
//6.题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
import java.util.Random;
public class practice_4_6__6 {
public static void main(String[] args) {
Random random = new Random();
for(int i=0;i<7;i++){
int m=random.nextInt(50);
System.out.print(m+":");
for(int j=0;j<m;j++)
{
System.out.print("*");
}System.out.println("");
}
}

}
