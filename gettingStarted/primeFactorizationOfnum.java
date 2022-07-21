
import java.util.*;

public class primeFactorizationOfnum{

public static void main(String[] args) {
  // write your code here 
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  for(int div=2;div*div<=n;div++){
    while(n%div==0){
      n=n/div;
      System.out.print(div+" ");
    }
  } 
  if(n!=0){
    System.out.print(n);
  }
 }
}