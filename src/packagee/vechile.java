package packagee;
//import java.util.*;

public class vechile {
	public int carid;
	public int carfees;
	private int carwidth;
	private int cardepth;
	private String carmod;
	private int caryear;
	static int count=-1;
	public String timearrive;
	public String timeleave;
	public static int totalCar=0;
	public static int currentCar=0;
	vechile(){
		carid=count;
		count++;
		carfees=0;
		carwidth=0;
		cardepth=0;
		carmod="";
		caryear=0;
		timearrive="";}
	public void setWidth(int w){
		carwidth=w;
	}
	public void setdepth(int d){
		cardepth=d;
	}
	public void setYear(int y){
		caryear=y;
	}
	public void setModel(String m){
		carmod=m;
	}
	public int getWidth(){
		return carwidth;
	}
	public int getdepth(){
		return cardepth;
	}
	public int getyear(){
		return caryear;
	}
	public String getModel(){
		return carmod;
	}
	public int getId(){
		return carid;
	}
	public void setArrTime(String arrTime){
		timearrive=arrTime;
	}
	public void setLevTime(String levTime){
		timeleave=levTime;
	}
	public String getArrTime(){
		return timearrive;
	}
	public String getLevTime(){
		return timeleave;
	}
}
