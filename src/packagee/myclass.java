package packagee;
import java.util.Scanner;
public class myclass {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		display d=new display();
		FirstPark fP=new FirstPark();
		bestPlace bP=new bestPlace();
		vechile c=new vechile ();
		CalculateIncome cali=new CalculateIncome();
		calculateFees calf=new calculateFees();
		parkout pOut=new parkout();
		enterData ent=new enterData();
		int size;
		int ch;
		System.out.println("HI, to be able to start the program we need the owner to setup slots and algortim");
        System.out.println("hi owner, please Set the garage passowrd(numbers only)");
          Scanner sgc=new Scanner(System.in);
          int password=(sgc.nextInt());
		System.out.println("please enter number of slots");
	     size=sc.nextInt();
	     vechile []arr=new vechile[size];
			slots [] sArr=new slots[size];
			for(int i=0;i<size;i++){
				arr[i]=null;
				ent.enterSlot(i,sArr,size);
			}
			d.display_slot(arr, size,sArr);
		System.out.println("please choose a technique");
		System.out.println("iF you enter 1 will be First place technique ");
		System.out.println("iF you enter 2 will be Best place technique ");
		 ch=sc.nextInt();
	    System.out.println("program is ready to use");
		for(int i=0;i<100;i++) {
			System.out.println("----------------------------------------------------");
			System.out.println("hi driver, please enter number of your function");
			System.out.println("To parkin-> 1");
			System.out.println("To parkout-> 2");
			System.out.println("To owner-> 3");
			int choose=sc.nextInt();
			switch(choose) {
			  case 1:
				  System.out.println("hi driver, please enter enter car details");
				   System.out.println("empty slots are ");
				   d.display_slot(arr, size,sArr);
				   if(ch==1){
					   fP.parkin( arr, size, sArr);
					   System.out.println("empty slots are ");
						d.display_slot(arr, size,sArr);
				   }
				   else if(ch==2){
					   bP.parkin( arr, size, sArr);
					   System.out.println("empty slots are ");
						d.display_slot(arr, size,sArr);
				   }
						
			    break;
			  case 2:
				  try {
						pOut.parkout( arr,size,c);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    break;
			  case 3:
                  System.out.println("hi owner, please enter the garage passowrd");
                  Scanner sch=new Scanner(System.in);
                  int pass=(sch.nextInt());
                  if(pass==password) {
                      cali.calculateIncome(c);
                  }
                  else {
                      System.out.println("Wrong password, please unable to show the data");
                  }
                  System.out.println("to exit press 0");
                  int n=sch.nextInt();
                  if(n==0) {
                      break;
                  }
			  default:
			    
			}	
			if(vechile.currentCar>=arr.length){
				System.out.println("Garage is Full ");
			}	
		}
		}
}
