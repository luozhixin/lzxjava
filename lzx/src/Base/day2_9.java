package Base;
//编写程序描述 IT 从业者
//问题描述：
//以面向对象的思想，编写自定义类描述 IT 从业者。设定属性包括：姓名，年龄，技术方向，工作年限；方法包括：工作。
//要求：
//1、	设置属性的私有访问权限，通过公有的 get，set 方法实现对属性的访问
//2、	限定 IT 从业人员必须年满 15 岁，无效信息需提示，并设置默认年龄为 15 3、 限定“技术方向”是只读属性
//4、	设计构造函数实现对属性赋值
//5、	工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
//6、 编写测试类，测试 IT 从业者类的对象及相关方法（测试数据信息自定）
public class day2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		itpractitioners itp=new itpractitioners("谢腾",13,10,"怡红院","端茶递水","小二");
		itp.println();

	}

}
class itpractitioners{
	private int age;//年龄
	private String name;//姓名
	private int workingage;//工作年龄
	private String workingplace;//工作地点
	private String TechnicalDirection;//技术方向
	private String post;//职位
	public itpractitioners(String name,int age,int workingage,String workingplace,String TechnicalDirection,String post) {
		if(age<15) {
		this.age=15;
		System.out.println("年龄信息无效!已修改默认年龄为15");

		}else {
			this.setAge(age);
		}
		this.setWorkingage(workingage);
		this.setName(name);
		this.setPost(post);
		this.TechnicalDirection = TechnicalDirection;
		this.setWorkingplace(workingplace);
		
		
	}
	public void println(){ // 输出方法
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("技术方向:"+TechnicalDirection);
        System.out.println("工作年限:"+workingage);
        System.out.println("目前就职于:"+workingplace);
        System.out.println("职务是:"+post);
    }

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkingage() {
		return workingage;
	}
	public void setWorkingage(int workingage) {
		this.workingage = workingage;
	}
	public String getWorkingplace() {
		return workingplace;
	}
	public void setWorkingplace(String workingplace) {
		this.workingplace = workingplace;
	}
	public String getTechnicalDirection() {
		return TechnicalDirection;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
}