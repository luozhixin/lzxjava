package Base;


//编写程序描述英雄和技能
//问题描述：司要开发新游戏，请用面向对象的思想设计英雄类和技能类。其中设定技能类
//属性包括：技能名称、攻击力、防御力、技能等级
//英雄类:
//属性包括：英雄名字、生命值、攻击力、防御力、掌握的技能
//方法包括：学习新技能的方法、攻击的方法，防御的方法
//要求：
//1、	设置属性的私有访问权限，通过公有的 get，set 方法实现对属性的访问
//2、	学习新技能的方法，需要判断新技能等级是否大于已经掌握技能等级，如果不满足条件则放弃学习
//3、	攻击方法描述攻击状态。内容包括英雄名字，生命值、攻击力。其中攻击力=个人攻击力+技能攻击力
//4、 防御方法通过输入参数接收攻击力。需要判断，如果攻击力小于防御力，伤害值=0；反之，伤害值=攻击力-防御力。根据伤害值情况显示不同的防御信息，内容包括英雄名字，防御力，防御后的生命值。其中防御力=个人防御力+技能防御力
//5、 编写测试类，构造技能对象和英雄对象，并调用相关方法（测试数据信息自定）
public class day2_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h=new hero("李小刀",300,"隔山打牛",40,30);
		skill s=new skill("葵花点穴手",1,50,40);
		h.Aggressivity();
		System.out.println("==========================");
		h.Defensive(h.getAggressivity());
		System.out.println("==========================");
		s.learn();
	}

}
class hero{
	private int Lifevalue;//生命值
	private String skill;//技能
	private String name;//名字
	private int Aggressivity;//攻击力
	private int Defensivepower;//防御力
	public  hero(String name,int Lifevalue,String skill,int Aggressivity,int Defensivepower) {
		this.setAggressivity(Aggressivity);
		this.setDefensivepower(Defensivepower);
		this.setLifevalue(Lifevalue);
		this.setName(name);
		this.setSkill(skill);
		
	}
	public void Aggressivity() {//攻击方法
		System.out.println("英雄"+this.name+"展开攻击");
		System.out.println("当前的生命值是："+this.Lifevalue);
		System.out.println("攻击力是："+this.Aggressivity);
		
		
	}
	public void Defensive(int Aggressivity) {//防御方法
		if(this.Defensivepower<Aggressivity) {
			System.out.println("防御失败！");
			System.out.println("英雄"+this.name+"以"+this.Defensivepower+"的防御力未能抵御进攻");
			this.Lifevalue=Aggressivity-this.Defensivepower;
		}else {
			System.out.println("防御成功！");
		}
		System.out.println("当前生命值为："+this.Lifevalue);
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getDefensivepower() {
		return Defensivepower;
	}
	public void setDefensivepower(int defensivepower) {
		Defensivepower = defensivepower;
	}
	public hero(int l,String n,int a) {
		this.setLifevalue(l);
		this.setName(n);
		this.setAggressivity(a);
		
	}
	public void sub(int l) {
		this.Lifevalue-=l;
		
	}
	
	public int getLifevalue() {
		return Lifevalue;
	}
	public void setLifevalue(int lifevalue) {
		Lifevalue = lifevalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAggressivity() {
		return Aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		Aggressivity = aggressivity;
	}


}
class skill{
	private String skillname;//技能名称
	private int level;//等级
	private int Aggressivity;//攻击力
	private int Defensivepower;//防御力
	public skill(String skillname,int level,int Aggressivity,int Defensivepower){
		this.setAggressivity(Aggressivity);
		this.setDefensivepower(Defensivepower);
		this.setLevel(level);
		this.setSkillname(skillname);
	}
	public void learn() {
		if(this.level>4) {
			System.out.println("学习此技能");
		}else {
			System.out.println(this.skillname+"等级过低，不需要学习");
		}
		
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	
	public int getAggressivity() {
		return Aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		Aggressivity = aggressivity;
	}
	public int getDefensivepower() {
		return Defensivepower;
	}
	public void setDefensivepower(int defensivepower) {
		Defensivepower = defensivepower;
	}
	
	
	
}
