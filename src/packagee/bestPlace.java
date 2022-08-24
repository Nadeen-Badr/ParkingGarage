package packagee;
import java.util.Scanner;
public class bestPlace implements website {
	public void parkin(vechile[]arr,int s,slots[]a){
		Scanner sc=new Scanner(System.in);
		//Best Place
			int num=sc.nextInt();
			ent.enter(num, arr, s);
			if(arr[num].getWidth()>a[num].getSlotW()||arr[num].getdepth()>a[num].getSlotD()){
				System.out.println("Sory, You can not park in this place");
				arr[num]=null;
			}
			else{
				System.out.println("You can park in this place");
				d.showwinfo(arr[num]);
				c.currentCar++;
				c.totalCar++;
			}
		}
}
