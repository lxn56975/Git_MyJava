package Hello;

import java.awt.print.Printable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class testCanlader {
	public static void main(String[] args)  {
		
		System.out.println("�������ڣ���ʽ���£���'��-��-��'��");
		Scanner inScanner=new Scanner(System.in);
		String str1=inScanner.nextLine();
		
		Calendar c1=new GregorianCalendar();
		System.out.println("��\tһ\t��\t��\t��\t�� \t��");
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1;
		try {
			
			 d1=df.parse(str1);
			 c1.setTime(d1);	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		c1.getFirstDayOfWeek();
		//System.out.print(c1);
		int day=c1.get(Calendar.DAY_OF_MONTH);
		c1.add(Calendar.DAY_OF_MONTH, -day+1);
		
		
		int firstday=c1.get(Calendar.DAY_OF_WEEK);
		int mymonth=1;
		
		for (int i = 1;i<=30; i++) {
			if (i==firstday&&mymonth==day) {
				System.out.print(mymonth+"*\t");
				mymonth++;
				firstday++;
			}
			else if(i==firstday){
				if(i%7==1){
					System.out.println();
				}
				System.out.print(mymonth+"\t");
				mymonth++;
				firstday++;
			}else {
				 System.out.print("   "+"\t");
			}
			
		}
	}
}
