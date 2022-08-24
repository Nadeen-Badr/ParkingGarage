package packagee;
public class owner {
	slots list=new slots();
	enterData ent=new enterData();
	calculateFees cal=new calculateFees();
	private int size;
	private int technique;
	public static double Totalincome=0;
	
	public void setSize(int s){
		size=s;
	}
	public void setTechnique(int t){
		technique=t;
	}
	public int getSize(){
		return size;
	}
	public int getTechnique(){
		return technique;
	}
}
