package Base;
import java.util.Scanner;
//4.题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？   
public class practice_4_6__4 {
	private static Scanner s;

	public static void main(String args[]) {
		while(true) {
		System.out.println("请输入当月利润（单位：万元）：");
		s = new Scanner(System.in);
		long a=s.nextLong();
		if(a<=10) {System.out.println("当月奖金为"+a*0.1+"万元");}
		if(a>10&&a<=20) {System.out.println("当月奖金为"+(1+(a-10)*0.075)+"万元");}
		if(a>20&&a<=40) {System.out.println("当月奖金为"+(1.75+(a-20)*0.05)+"万元");}
		if(a>40&&a<=60) {System.out.println("当月奖金为"+(2.75+(a-40)*0.03)+"万元");}
		if(a>60&&a<=100) {System.out.println("当月奖金为"+(3.35+(a-60)*0.015)+"万元");}
		if(a>100) {System.out.println("当月奖金为"+(3.95+(a-100)*0.01)+"万元");}
		}
	}
}
