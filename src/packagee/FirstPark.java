package packagee;

class FirstPark implements website {
	public void parkin(vechile[]arr,int s,slots[]a){
		//First Place
			for(int i=0;i<s;i++){
				if(arr[i]==null){
					ent.enter(i,arr,s);
					System.out.println("You can park in slot "+" "+i);
					d.showwinfo(arr[i]);
					c.currentCar++;
					c.totalCar++;
					break;
				}
			}
		}
}
