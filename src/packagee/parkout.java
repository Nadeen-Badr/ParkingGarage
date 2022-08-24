package packagee;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class parkout{
	//display d=new display();
	calculateFees cal=new calculateFees();
	Scanner sc=new Scanner(System.in);
	parkout(){
		
	}
	//PARK OUT!!
		public void parkout(vechile[]arr,int s,vechile c) throws Exception{
			System.out.println("PLZ,Enter your slot number");
			int slotNum=sc.nextInt();
			String arrtime=arr[slotNum].getArrTime();
			System.out.println("time arrive is"+"  "+arrtime );
			c.setLevTime(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
			System.out.println("time leave is"+"  "+c.timeleave );
			cal.calculateFees(arrtime,c.getLevTime());
			arr[slotNum]=null;
			c.currentCar--;
			System.out.println("Great your slot free now");
			
			
		}

}
