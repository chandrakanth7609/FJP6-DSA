
import java.util.*;
  
  public class countDigitinAnum {
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    // Integer n1=Integer.valueOf(n);
    // String s=Integer.toString(n1);
    // System.out.println(s.length());
      int count=0;
      while(n!=0)  {
      n=n/10;
      count++;
      }
    System.out.println(count);
    }
  }