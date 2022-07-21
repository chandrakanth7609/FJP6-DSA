
import java.util.*;
   
   public class reverseAnum {
   
   public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
    

     // write your code here
     while (n>0){
       int digit=n%10;
       System.out.print(digit);
       n=n/10;
     } 
    }
   }