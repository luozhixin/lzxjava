package SuanFa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datatest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat s=new SimpleDateFormat("yyyy��MM��dd��");//����õ���ľ����ض�                                                             
		String time=s.format(d);
		System.out.println(time);
		String s1="2019��03��04��";
		Date date1 = s.parse(s1);
		Calendar cal=Calendar.getInstance();
		cal.setTime(date1);
		int i = cal.get(Calendar.WEEK_OF_YEAR);
		int i3 = cal.get(Calendar.DAY_OF_YEAR);
		date1 = s.parse(time);
		cal=Calendar.getInstance();
		cal.setTime(date1);
		int i2 = cal.get(Calendar.WEEK_OF_YEAR);
		int i4 = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("2019��03��04�����ڹ���"+(i2-i)+"��");
		System.out.println("2019��03��04�����ڹ���"+(i4-i3)+"��");
		

	}

}
