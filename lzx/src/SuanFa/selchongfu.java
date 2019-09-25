package SuanFa;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class selchongfu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="lgooleeeee";
		LinkedList<Character> s=new LinkedList<Character>();
		LinkedList<Integer> n=new LinkedList<Integer>();
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			@SuppressWarnings("rawtypes")
			Set set=m.keySet();
			if (!(set.contains(str.charAt(i)))) {
				m.put(str.charAt(i), 1);
				s.add(str.charAt(i));	
			}else {
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
				n.add(s.indexOf(str.charAt(i)),n.get(s.indexOf(str.charAt(i)))+1);
				n.remove(s.indexOf(str.charAt(i))+1);
			}

		}
		System.out.println(m);
		System.out.println(s);
		System.out.println(n);
	}

}
