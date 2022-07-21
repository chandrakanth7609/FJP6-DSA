
import java.util.Scanner;
   
   public class rotateAnum{
   
   public static void main(String[] args) {
     // write your code here 
     //System.out.println("enter the number n:");
     Scanner scn=new Scanner(System.in);
     int num=scn.nextInt();
     //System.out.println("enter the number k:");
     int k=scn.nextInt(); 
     int tnum=num;
     int count=0;
     while(tnum!=0){
       tnum=tnum/10;
       count++;
     }
     if(k<0){
         k=k+count;
     }
     k=k%count;//actual rotations
     int temp1=(int)Math.pow(10,k);
     int p1=num%temp1;
     int p2=num/temp1;
     int temp2=(int)Math.pow(10,count-k);
     int ans=(p1*temp2)+p2;
     System.out.println(ans);
   }
   }