import java.util.*;
  
  public class fibonacciTillN{
  
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
      // write your code here
      int n1=0,n2=1;
      System.out.println(n1);
      System.out.println(n2);
      int i=2;
      while(i<n){
        int n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
        i++;
      }
   }
  }