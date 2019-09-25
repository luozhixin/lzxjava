package Base;
//、、构造方法与重载 
//定义一个网络用户类要处理的信息有用户ID、用户密码、email
//地址。在建立类的实例时把以上三个信息都作为
//构造函数的参数输入其中用户ID和用户密码时必须为缺省的email地址是用户ID加上字符串"@gameschool.com"  
public class day2_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User(1, "4651	", 1761313 + "@gameschool.com");
		System.out.println("ID ：" + u.getId() + "\r 密 码：" + u.getPassword()
				+ "\remail：" + u.geteAddr());
 
	}
	
}
 class User {
	 private int id;
	 private String password;
	 private String eAddr;
	
	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public User(int id,String password,String eAddr){
		this.setId(id);
		this.setPassword(password);
		this.seteAddr(eAddr);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

