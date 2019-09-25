package SuanFa;
import java.util.HashSet;
import java.util.Set;


public class SetTest {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();	
	while(true){
		int sui = (int) (Math.random() * 33) ;// 获取33以内的数字 
		set.add(sui<10?"0"+sui:""+sui);//将元素存入集合中
		if (set.size() == 6) {//存满六个红色球，则结束循环
			break;
		}
	}
	Set<String> set2 = new HashSet<String>();
	int sui2 = (int) (Math.random() * 16) + 1;// 获取16以内的数字
	set2.add(sui2<10?"0"+sui2:""+sui2);
	System.out.println("红球：" + set + " 蓝球：" + set2);

	
}
}
