
import java.util.Scanner;
public class gcdAndLcm
{
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	//System.out.println("enter two numbers:");
	int n1=scn.nextInt();
	int n2=scn.nextInt();
	int num1=n1;
	int num2=n2;
	while(n1%n2!=0){
	    int rem=n1%n2;
	    n1=n2;
	    n2=rem;
	    
	}
	int gcd=n2;
	int lcm=(num1*num2/gcd);
	//System.out.println("result of two numbers:");
	System.out.println(gcd);
	System.out.println(lcm);
	}
}