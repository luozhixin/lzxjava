package Base;
//.构造方法 编写Java程序用于显示人的姓名和年龄。 定义一个人类Person该类中应该
//有两个私有属性姓名name和年龄age。定义构造方法
//用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。
//在main方法中创建人类的实例然后，将信息显示。 
public class day2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person("tom",18); 
System.out.println("名字："+p.name+"    年龄："+p.age);
	}

}
class  Person { 
String name; 
int age; 
public Person(String name,int age){ 
this.name=name; 
this.age=age; 
}
}