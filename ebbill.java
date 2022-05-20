package packages;
import java.util.Scanner;

public class ebbill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int units;
		String customername;
		
		float amount = 0,surcharge;
	
	System.out.println("enter the customername");
	customername=sc.nextLine();
	System.out.println("enter the units");

    units=sc.nextInt();
	if(units>0 && units<=100) {
	amount=units*2;
	}
	else if(units>=100 && units<=200) {
		amount=100*2.0f+200*3.0f+(units-300)*5.0f;
		surcharge=(amount*2.5f)/100;
		amount=amount+surcharge;
	}
	System.out.println("name of the customer:" +customername);
	System.out.println("number of units consumed :" +units);
	System.out.println("bill amount:" +amount);
	sc.close();
	}

	
	
		}
	
		
	
	