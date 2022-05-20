package packages;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

	int n,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	n=sc.nextInt();
	
	for (int i=n;i>=1;i++) {
		fact=fact*i;
	}
	System.out.println("factorial of a number is" +fact);
	}
	}

