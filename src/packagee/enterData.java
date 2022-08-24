package packagee;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class enterData {
	enterData(){}
	public  void enter(int n,vechile[]arr,int s){
		vechile c=new vechile();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter car width");
		c.setWidth(sc.nextInt());
		System.out.println("please enter car depth");
		c.setdepth(sc.nextInt());
		System.out.println("please enter car module");
		c.setModel(sc.next());
		System.out.println("please enter car year");
		c.setYear(sc.nextInt());
		c.setArrTime(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
		//c.setArrTime(DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
		arr[n]=c;
	}
	public static void enterSlot(int n,slots[]arr,int s){
		slots slot=new slots();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter slot width to slot"+" "+n);
		slot.setSlotW(sc.nextInt());
		System.out.println("please enter slot depth to slot"+" "+n);
		slot.setSlotD(sc.nextInt());
		arr[n]=slot;
	}
}
