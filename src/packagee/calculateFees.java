package packagee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class calculateFees {
	public void calculateFees(String arr,String lev) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss"); 
		Date date1 = format.parse(arr);
		Date date2 = format.parse(lev);
		long difference = date2.getTime() - date1.getTime(); 
		long diffSeconds = difference / 1000 % 60;
		long diffMinutes = difference / (60 * 1000) % 60;
		long diffHours = difference / (60 * 60 * 1000) % 24;
		System.out.print(diffHours + " hours, ");
		System.out.print(diffMinutes + " minutes, ");
		System.out.println(diffSeconds +"second");
		double diffTotal=(diffSeconds*0.0013889+diffMinutes*0.0833+diffHours*5);
		System.out.println("Total Fees is: "+diffTotal +"  EGP");
		owner o=new owner();
		o.Totalincome+=diffTotal;
	}
}
