package Base;
import java.util.Scanner;

//编写程序描述银行储户信息
//问题描述：
//某公司要开发“银行管理系统”，请使用面向对象的思想，设计银行的储户信息
//要求：
//1、 分析储户的属性和方法，设计储户类
//2、 设置属性的私有访问权限，通过公有的 get，set 方法实现对属性的访问
//3、 编写测试类，测试储户类的对象及相关方法（测试数据信息自定）
//4、 创建包 info---存放储户类，创建包 test---存放测试类
//参考分析思路：储户类：
//属性: 用户姓名、密码、身份证号、账号、帐户余额方法：
//1、存款：验证账号是否有效，存款金额是否有效，如果有效修改账户余额
//2、 取款：验证账号是否有效，取款金额是否有效，余额是否够用，如果有效修改余额
//运行效果：
public class day2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankmanager bank=new bankmanager("1797654231","王丽丽",2000); 
		System.out.println("请输入账号（1797654231）：");
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		String account=input.next();
		if(account.equals(bank.getAccount())){
			System.out.println("请输入存款金额：");
			int money =input.nextInt();
			bank.deposit(money);
			bank.println();
			System.out.println("===========");
			System.out.println("请输入取款金额：");
			int money2 =input.nextInt();
			bank.Withdrawmoney(money2);
		}else{
			System.out.println("账号错误");
			
		}
	}

}
class bankmanager{
	private String account;//账号
	private String name;//姓名
	private int balance;//余额
	
	public bankmanager(String account,String name,int balance){
		this.setAccount(account);
		this.setBalance(balance);
		this.setName(name);
		
	}
	public void println(){
		//打印账户信息
		System.out.println("储户姓名:"+this.name);
		System.out.println("账号:"+this.account);
		System.out.println("余额:"+this.balance);
	}
	public void deposit(int money) {//存款
		
		this.balance+=money;
		System.out.println("存款成功!");
	}
    public void Withdrawmoney(int money) {//取款
		if(money>this.balance) {
			System.out.println("余额不足");
		}else {
			this.balance-=money;
			System.out.println("取款成功");
		}
		
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}