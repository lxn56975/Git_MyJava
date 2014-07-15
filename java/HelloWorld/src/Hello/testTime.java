package Hello;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;

/**
 * @author xiaoning
 */
public class testTime {
	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本年的第W周");
		
		Date d1=new Date(System.currentTimeMillis());
		String str=df.format(d1);
		System.out.print(str);
		System.out.print("##############################");
		DateFormat df2;
		String str1="1991-06-23,20:00:01";
	
		df2=new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
		Date date2=new Date();
		try {
			date2=(Date)df2.parse(str1);
			System.out.print(date2.toGMTString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
