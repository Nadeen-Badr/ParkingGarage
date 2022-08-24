package packagee;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class display {
	display(){	
	}
	public void showwinfo(vechile c) {
		System.out.println("car id"+"  "+c.carid);
		System.out.println("car dimention"+"  "+(c.getWidth()*c.getdepth()));
		System.out.println("car moudle"+"  "+c.getModel());
		System.out.println("car year"+"  "+c.getyear());	
		System.out.println("time arrive is"+"  "+c.timearrive );
	}
	public void display_slot(vechile[]arr,int s,slots[] a){
		for(int i=0;i<s;i++){
			if(arr[i]==null){
				System.out.println("Slot number"+"  "+i+" Empty"+"  "+"width"+" "+a[i].getSlotW()+"  "+"Depth"+" "+a[i].getSlotD());	
			}
		}
	}
	
	
	
	
	
	
}
